package String;

import java.util.Scanner;

//1-11.문자열 압축
public class Solution_11 {
    public String solution(String str){
        StringBuilder sb = new StringBuilder();
        //2. for문 1개로 구현
        str = str+" ";
        System.out.println(str.length());
        int cnt = 1;
        for(int i=0; i<str.length()-1; i++){
            System.out.println("i: "+i);
            if(str.charAt(i)==str.charAt(i+1)) cnt++;
            else{
                sb.append(str.charAt(i));
                if(cnt>1) sb.append(cnt);
                cnt=1;
                System.out.println(sb.toString());
            }
        }

        //1. 구현
//        int i = 0;
//        int len = str.length();
//        while(i<len){
//            char ch = str.charAt(i);
//            sb.append(ch);
//            int cnt = 1;
//            while(i<len-1&&ch==str.charAt(i+1)){
//                cnt++;
//                i++;
//            }
//            if(cnt>1) sb.append(cnt);
//            i++;
//        }
        return sb.toString();
    }
    public static void main(String[] args){
        Solution_11 T = new Solution_11();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
