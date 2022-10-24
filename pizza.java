package SoloTest.Programmers;

public class pizza {

    public static int solution(int slice, int n) {
        int answer = 0;
        double m = (double) n/slice;
        if(slice > n){
            answer = 1;
        }else if(m == n/slice){
            answer = (int)m;
        }else{
            answer = (int)m + 1;
        }
        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;
        if(n <= 7){
            answer = 1;
        }else if(n%7 == 0){
            answer = n/7;
        }else{
            answer = n/7 +1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7,10));
        System.out.println(solution2(7));
    }
}

