package Two_pointers;

import java.util.*;

//3-2. 공통원소 찾기
public class Solution_2 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        //일단 오름차순 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //투포인터 알고리즘
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(arr1[p1]==arr2[p2]){
                list.add(arr1[p1++]);
                p2++;
            } else{
                if(arr1[p1]<arr2[p2]) p1++;
                else p2++;
            }
        }
        return list;
    }

    public static void main(String[] args){
        Solution_2 T = new Solution_2();
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