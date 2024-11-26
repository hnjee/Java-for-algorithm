package Array;

import java.util.Scanner;

//1-1. 큰 수 출력하기
public class Solution_1 {
    public boolean[] solution(int n, int[] arr){
        boolean[] answer = new boolean[n];
        answer[0] = true;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                answer[i]=true;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution_1 T = new Solution_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        boolean[] answer = T.solution(n, arr);
        for(int i=0; i<n; i++){
            if(answer[i]) System.out.print(arr[i]+" ");
        }

    }
}
