package Array;

import java.util.Scanner;

//2-5. 소수
//소수 : 1과 자신을 제외한 어떠한 자연수로도 나누어 떨어질 수 없는 수
public class Solution_5 {
    public boolean solution(int x){
        //x의 제곱근까지만 체크. Math.sqrt()
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Solution_5 T = new Solution_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(T.solution(i)) answer++;
        }
        System.out.println(answer);
    }
}