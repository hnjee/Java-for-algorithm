package Two_pointers_Sliding_window;

import java.util.Scanner;

//3-3. 최대매출 (Sliding Window)
//Sliding Window: 교집합의 정보를 공유하고, 차이가 나는 양쪽 끝 원소만 갱신하는 알고리즘
// 0   1   2   3         6   7   8   9
//[12 <15 11] 20> 25 10 [20 <19 13] 15>
public class Solution_3 {
    public int solution(int n, int k, int[] arr){
        int answer=0, sum=0;
        for(int i=0; i<k; i++) sum+=arr[i];
        answer = sum; //이 부분 필수!
        for(int i=k; i<n; i++){
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution_3 T = new Solution_3();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.print(T.solution(n, k, arr));

    }
}