package Array;

import java.util.Scanner;

//2-7. 점수계산
public class Solution_7 {
    public int solution(int n, int[] arr){
        int sum = 0;
        int pre = 0;
        for(int x : arr){
            if(x==0) pre = 0;
            else {
                pre++;
                sum+=pre;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Solution_7 T = new Solution_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution(n, arr));
    }
}