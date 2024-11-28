package Array;

import java.util.Scanner;

//2-5. 소수
//에라토스테네스 체: 배열에서 소수의 배수를 모두 제거하고 남은 숫자는 모두 소수
public class Solution_5_2 {
    public int solution(int n){
        int cnt = 0;
        int[] arr = new int[n+1]; //기본값 0
        for(int i=2; i<=n; i++){
            if(arr[i]==0){
                cnt++;
                for(int j=i; j<=n; j=j+i) arr[j]=1;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Solution_5_2 T = new Solution_5_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}