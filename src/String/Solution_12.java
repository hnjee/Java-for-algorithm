package String;

import java.util.Scanner;

//1-12. 암호
public class Solution_12 {
    public String solution(int n, String str){
        StringBuilder answer = new StringBuilder();
        str = str.replaceAll("\\*", "0").replaceAll("#", "1");
        for(int i=0; i<n; i++){
            String tmp = str.substring(i*7, (i+1)*7);
            int x = Integer.parseInt(tmp, 2); //2진수->10진수
            char ch = (char) x;
            answer.append(ch);
        }
        return answer.toString();
    }
    public static void main(String[] args){
        Solution_12 T = new Solution_12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        String str = kb.nextLine();
        System.out.println(T.solution(n, str));
    }
}
