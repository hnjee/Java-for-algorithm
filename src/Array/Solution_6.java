package Array;

import java.util.ArrayList;
import java.util.Scanner;

//2-6. 뒤집은 소수
public class Solution_6 {
    public boolean sosu(int x){
        //0,1은 소수가 아니다.
        if(x<2) return false;
        //x의 제곱근까지만 체크. Math.sqrt()
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        //2. 숫자로 뒤집기
        for(int x : arr){
            int reversedX = 0;
            while(x>0){
                reversedX = reversedX*10 + (x%10);
                x = x/10;
            }
            if(sosu(reversedX)) answer.add(reversedX);
        }

        //1. StringBulider reverse() 사용
//        for(int x : arr){
//            StringBuilder sb = new StringBuilder(Integer.toString(x)).reverse();
//            int reversedX = Integer.parseInt(sb.toString());
//            if(sosu(reversedX)) answer.add(reversedX);
//        }
        return answer;
    }
    public static void main(String[] args){
        Solution_6 T = new Solution_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(n, arr)) System.out.print(x+" ");
    }
}