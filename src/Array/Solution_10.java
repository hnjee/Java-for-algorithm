package Array;

import java.util.Scanner;

//2-9. 격자판 최대합 (가장자리 0으로 추가해서 경계조건 없애기)
public class Solution_10 {
    public int solution(int n, int[][] arr){
        int answer = 0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                int x = arr[i][j];
                //위, 아래, 왼, 오
                if(x>arr[i-1][j] && x>arr[i+1][j] && x>arr[i][j-1] && x>arr[i][j+1]) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution_10 T = new Solution_10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}