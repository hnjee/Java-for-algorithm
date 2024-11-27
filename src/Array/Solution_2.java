package Array;

import java.util.Scanner;

//2-2. 보이는 학생
public class Solution_2 {
    public int solution(int n, int[] arr){
        int answer = 1;
        int tall = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>tall){
                answer++;
                tall = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution_2 T = new Solution_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
