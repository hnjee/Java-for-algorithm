package Array;
import java.util.Scanner;

//2-12. 멘토링 (4중 for문 - 하나하나 비교)
public class Solution_12_2 {
    public int solution(int n, int m, int[][] arr){
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                //(i-멘토, j-멘티) 모든 경우의 수
                int cnt=0;
                for(int x=0; x<m; x++){
                    int i_rank=0, j_rank=0;
                    for(int y=0; y<n; y++){
                        //arr 탐색하며 i와 j의 등수 저장
                        if(arr[x][y]==i) i_rank=y;
                        if(arr[x][y]==j) j_rank=y;
                    }
                    //i의 등수가 j의 등수보다 높으면(작으면) cnt++
                    if(i_rank<j_rank) cnt++;
                }
                //i의 등수가 j의 등수보다 높은 경우가 m번(매번)이면 answer++
                if(cnt==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution_12_2 T = new Solution_12_2();
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