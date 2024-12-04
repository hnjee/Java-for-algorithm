package Array;

import java.util.Scanner;

//2-11. 임시반장 정하기
public class Solution_11 {
    public int solution(int n, int[][] arr){
        boolean[][] map = new boolean[n][n];

        for(int i=0; i<n; i++){ //학생
            for(int j=0; j<5; j++){ //학년
                int one = arr[i][j];
                for(int k=0; k<n; k++){
                    int other = arr[k][j];
                    if(one==other) map[i][k]=true;
                }
            }
        }

        int answer = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++) if(map[i][j]) cnt++;
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }
        return answer+1;
    }
    public static void main(String[] args){
        Solution_11 T = new Solution_11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}