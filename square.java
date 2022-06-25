package SoloTest.Programmers;

import java.util.Map;

public class square {
    public static void main(String[] args) {
        long n = 121;
        long m = -1;

        long answer = (long) Math.sqrt(n);
        System.out.println("answer = " + answer);


        if(Math.pow(answer,2) == n){
            m = (long) Math.pow(answer+1,2);
        }
        System.out.println("m = " + m);
    }
}
