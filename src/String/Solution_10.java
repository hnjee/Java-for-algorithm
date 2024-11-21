package String;

import java.util.Scanner;

//1-10. 가장 짧은 문자거리
public class Solution_10 {
    public int[] solution(String str, Character target){
        int len = str.length();
        int[] answer = new int[len];
        if(!str.contains(target.toString())) return answer;

        //indexOf(), lastIndexOf() 사용
        for (int i=0; i<len; i++){
            char tmp = str.charAt(i);
            if(tmp==target){
                answer[i]=0;
            } else{
                int front = str.indexOf(target, i+1);
                int back = str.substring(0, i).lastIndexOf(target);
                if(front==-1) answer[i] = i-back;
                else if(back==-1) answer[i] = front-i;
                else answer[i] = Math.min(i-back, front-i);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution_10 T = new Solution_10();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        for(int i : T.solution(str.substring(0, str.length()-2), str.charAt(str.length()-1))){
            System.out.print(i+" ");
        }
    }
}
