package Array;

import java.util.Scanner;

//2-8. 등수 구하기
//100 100 29 29 30 40
public class Solution_8 {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        //2. 이중 for문 사용
        for(int i=0; i<n; i++){
            int rank = 1;
            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]) rank++;
            }
            answer[i]=rank;
        }
        //1. Hashmap, Arrays.sort() 사용
//        HashMap<Integer, Integer> map = new HashMap<>();
//        //int[] sortedArr = arr; //얕은복사: 객체 주소만 복사됨
//        //깊은복사
//        int[] sortedArr = new int[n];
//        for(int i=0; i<n; i++) sortedArr[i] = arr[i];
//        Arrays.sort(sortedArr);
//        for(int i=0; i<n; i++) map.put(sortedArr[i], n-i); //동점이면 가장 높은 등수가 저장됨
//        for(int i=0; i<n; i++) answer[i] = map.get(arr[i]);
        return answer;
    }
    public static void main(String[] args){
        Solution_8 T = new Solution_8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}