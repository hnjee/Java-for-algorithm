package Array;

import java.util.Scanner;

//2-9. 격자판 최대합
//        10 13 10 12 15
//        12 39 30 23 11
//        11 25 50 53 15
//        19 27 29 37 27
//        19 13 30 13 19
public class Solution_9 {
    public int solution(int n, int[][] arr){
        int answer = 0;
        //가로, 세로
        int sum1=0, sum2=0;
        for(int i=0; i<n; i++){
            sum1 = sum2 = 0;
            for(int j=0; j<n; j++) {
                sum1+=arr[j][i];
                sum2+=arr[i][j];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        //대각선
        sum1=sum2=0;
        for(int i=0; i<n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-1-i]; //0,4 - 1-3
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
    public static void main(String[] args){
        Solution_9 T = new Solution_9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}