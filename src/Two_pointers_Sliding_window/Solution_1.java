package Two_pointers_Sliding_window;

import java.util.Scanner;

//3-1. 두 배열 합치기 (Two pointers)
//Two pointers: 1차원 배열에서 각자 다른 원소를 가리키고 있는 2개의 포인터를 조작해가면서 원하는 값을 찾을 때 까지 탐색하는 알고리즘
public class Solution_1 {
    public int[] solution(int n, int m, int[] arr1, int[] arr2){
        int[] answer = new int[n+m];
        //2. two pointers
        int p1=0, p2=0;
        int index = 0;
        while(p1<n && p2<m){
            if(arr1[p1]<arr2[p2]) answer[index++]=arr1[p1++];
            else answer[index++]=arr2[p2++];
        }
        while(p1<n) answer[index++]=arr1[p1++];
        while(p2<m) answer[index++]=arr2[p2++];

        //1. 단순 구현 풀이
//        for(int i=0; i<n; i++) answer[i]=arr1[i];
//        for(int i=0; i<m; i++) answer[n+i]=arr2[i];
//        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args){
        Solution_1 T = new Solution_1();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) arr1[i]=kb.nextInt();
        int m=kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) arr2[i]=kb.nextInt();
        for(int i : T.solution(n, m, arr1, arr2)) {
            System.out.print(i+" ");
        }
    }
}