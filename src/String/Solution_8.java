package String;

import java.util.Scanner;

//1-8. 유효한 팰린드롬
public class Solution_8 {
    public String solution(String str){
        //2. 정규식 사용
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)) return "YES";
        return "NO";

        //1. 구현
//        StringBuilder sb = new StringBuilder(str);
//        for(int i=sb.length()-1; i>-1; i--){
//            if(Character.isAlphabetic(sb.charAt(i))) continue;
//            sb.deleteCharAt(i);
//        }
//        str = sb.toString();
//        String reversed = sb.reverse().toString();
//        if(str.equalsIgnoreCase(reversed)) return "YES";
//        return "NO";
    }
    public static void main(String[] args){
        Solution_8 T = new Solution_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
