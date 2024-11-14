package String;

import java.util.Scanner;

//1-6. 중복문자 제거
public class Solution_6 {
    public String solution(String str){
        //2. indexOf() 사용
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch)==i) answer.append(ch); //이게 첫번째 문자인 경우에만
        }
        return answer.toString();

        //1. for문으로 StringBuilder 지우기
//        StringBuilder sb = new StringBuilder(str);
//        for(int i=0; i<sb.length(); i++){
//            char ch = sb.charAt(i);
//            for(int j=sb.length()-1; j>i; j--){
//                if(sb.charAt(j)==ch) sb.deleteCharAt(j);
//            }
//        }
//        return sb.toString();
    }
    public static void main(String[] args){
        Solution_6 T = new Solution_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}