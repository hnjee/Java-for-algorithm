package String;

import java.util.Scanner;

//1-3. 문장 속 가장 긴 단어
public class Solution_3 {
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE;

        //1. split()
//        String[] arr = str.split(" ");
//        for(String x : arr){
//            int len = x.length();
//            if(len>max){
//                max=len;
//                answer=x;
//            }
//        }

        //2. indexOf(), substring()
        int pos;
        while((pos = str.indexOf(" "))!=-1){
            String tmp = str.substring(0,pos); //0부터 pos전까지
            int len = tmp.length();
            if(len>max){
                max= len;
                answer = tmp;
            }
            str = str.substring(pos+1); //pos+1부터 끝까지
        }
        if(str.length()>max) answer=str; //띄어쓰기가 없는 문장인 경우
        return answer;
    }
    public static void main(String[] args){
        Solution_3 T = new Solution_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
