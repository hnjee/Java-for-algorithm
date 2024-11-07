package String;

import java.util.Scanner;

//1-1. 문자찾기
public class Solution_1 {
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        //향상된 for문
        for(char x : str.toCharArray()){
            if(x==c) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Solution_1 T = new Solution_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        //System.out.println(T.solution(str, c));
    }
}
