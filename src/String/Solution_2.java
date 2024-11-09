package String;

import java.util.Scanner;

//1-2. 대소문자 변환
public class Solution_2 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            //1. 직접 구현
            //if(x>='a' && x<='z') answer+=Character.toUpperCase(x);

            //2. Character.isLowerCase()
            //if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);

            //3. 아스키코드: 대문자 65-90, 소문자 97-122, 둘의 차이는 32
            if(x>96 && x<123) answer+=(char)(x-32);
            else answer+=(char)(x+32);
        }
        return answer;
    }
    public static void main(String[] args){
        Solution_2 T = new Solution_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
