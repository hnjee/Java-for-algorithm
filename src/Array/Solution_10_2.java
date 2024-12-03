package Array;
import java.util.Scanner;

//2-10. 봉우리 (경계조건 추가해서 메모리사용 줄이기)
public class Solution_10_2 {
    //아래, 오른쪽, 위, 왼쪽
    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
    public int solution(int n, int[][] arr){
        int answer=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){ //위아래왼오에 더 크거나 같은게 있으면
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution_10_2 T = new Solution_10_2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}