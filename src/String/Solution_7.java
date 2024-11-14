package String;

import java.util.Scanner;

//1-7. 회문문자열
public class Solution_7 {
    public String solution(String str){
        //3. StringBuilder().reverse()
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) return "YES";
        return "NO";

        //2. for문 charAt
//        str = str.toUpperCase();
//        int len = str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
//        }
//        return "YES";

        //1. while문 lt, rt
//        str = str.toUpperCase();
//        char[] arr = str.toCharArray();
//        int len = str.length();
//        int lt = 0;
//        int rt = len-1;
//        while(lt<rt){
//            if(arr[lt]!=arr[rt]) return "NO";
//            lt++;
//            rt--;
//        }
//        return "YES";


    }
    public static void main(String[] args){
        Solution_7 T = new Solution_7();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}