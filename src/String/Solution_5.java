package String;

import java.util.Scanner;

//1-5. 특정문자 뒤집기
public class Solution_5 {
    public String solution(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        int lt = 0;
        int rt = len-1;
        while(lt<rt){
            //특수부호면 순서 넘기기
            while(lt<len && !Character.isAlphabetic(arr[lt])) lt++;
            while(rt>-1 && !Character.isAlphabetic(arr[rt])) rt--;
            //위치 확인
            if(lt>=rt) break;
            //문자 뒤집기
            char tmp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = tmp;
            lt++;
            rt--;
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args){
        Solution_5 T = new Solution_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
