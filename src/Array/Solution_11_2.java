package Array;

import java.util.Scanner;

//2-11. 임시반장 정하기
//9 8 7 6 5
//5 6 7 8 9
//1 2 3 7 8
//4 5 3 4 2
//6 2 8 4 2
public class Solution_11_2 {
    public int solution(int n, int[][] arr){
        int answer = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            int cnt=0; //학생i가 같은 반이었던 학생의 수 count
            for(int j=0; j<n; j++){
                if(i==j) continue;
                //학생i, 학생j의 모든 경우의 수
                for(int k=0; k<5; k++){
                    //학년 비교
                    int i_grade = arr[i][k];
                    int j_grade = arr[j][k];
                    if(i_grade==j_grade) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer+1;
    }
    public static void main(String[] args){
        Solution_11_2 T = new Solution_11_2();
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