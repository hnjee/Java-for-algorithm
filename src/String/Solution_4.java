package String;

import java.util.ArrayList;
import java.util.Scanner;

//1-4. 단어 뒤집기
public class Solution_4 {
    //1. charAt()으로 거꾸로 만들기
//    public String[] solution(int n, String[] arr){
//        String[] answer = new String[n];
//        for(int i=0; i<n; i++){
//            String word = arr[i];
//            String tmp = "";
//            int len = word.length()-1;
//            for(int j=len; j>-1; j--){
//                tmp += word.charAt(j);
//            }
//            answer[i]=tmp;
//        }
//        return answer;
//    }

    //2. StringBuilder(x).reverse().toString()
//    public ArrayList<String> solution(int n, String[] str){
//        ArrayList<String> answer=new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }

    //3. 서로 자리 바꾸기
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x : str){
            char[] s=x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){ //같거나 바뀌는 경우 끝
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    public static void main(String[] args){
        Solution_4 T = new Solution_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.next();
        }
        for(String x : T.solution(n, arr)){
            System.out.println(x);
        }
    }
}
