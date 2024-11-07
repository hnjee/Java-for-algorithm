package String;

public class Solution_1 {
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        //기본 for문
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==c) answer++;
//        }dd

        //향상된 for문
        for(char x : str.toCharArray()){
            if(x==c) answer++;
        }
        return answer;
    }
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        char c = kb.next().charAt(0);
//        System.out.println(T.solution(str, c));
//    }
}
