package String;

import java.util.Scanner;

//1-9. 숫자만 추출
public class Solution_9 {
    public int solution(String str){
        //2. Character.isDigit()
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)) sb.append(ch);
        }
        return Integer.parseInt(sb.toString());

        //1. 정규식 사용
//        str = str.replaceAll("[^0-9]", "");
//        return Integer.parseInt(str);
    }
    public static void main(String[] args){
        Solution_9 T = new Solution_9();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
