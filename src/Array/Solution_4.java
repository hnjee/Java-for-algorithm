package Array;

import java.util.Scanner;

//2-4. 피보나치수열
public class Solution_4 {
    public int[] solution(int n){
        int[] fibo = new int[n];
        fibo[0]=1;
        fibo[1]=1;
        for(int i=2; i<n; i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        return fibo;
    }
    public static void main(String[] args){
        Solution_4 T = new Solution_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] fibo = T.solution(n);
        for(int i=0; i<n; i++){
            System.out.print(fibo[i]+" ");
        }
    }
}