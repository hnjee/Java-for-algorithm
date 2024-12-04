package Array;
import java.util.Scanner;

//2-12. 멘토링 (answer 배열 추가해서 시간복잡도 낮추기)
public class Solution_12 {
    public int solution(int n, int m, int[][] arr){
        int[][] answer = new int[n][n];
        int cnt = 0;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                int x = arr[i][j];
                for(int k=j-1; k>=0; k--){
                    int y = arr[i][k];
                    answer[x-1][y-1] = 1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j) answer[i][j] = 1;
                if(answer[i][j]==0) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Solution_12 T = new Solution_12();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}