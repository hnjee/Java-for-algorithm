package Array;

import java.util.Scanner;

//2-3. 가위바위보
//1:가위, 2:바위, 3:보
public class Solution_3 {
    public char solution(int a, int b){
        if(a==b) return 'D';
        if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)) return 'A';
        return 'B';
    }
    public static void main(String[] args){
        Solution_3 T = new Solution_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        for(int i=0; i<n; i++){
            arrA[i]=kb.nextInt();
        }
        int[] arrB = new int[n];
        for(int i=0; i<n; i++){
            arrB[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(T.solution(arrA[i], arrB[i]));
        }
    }
}
