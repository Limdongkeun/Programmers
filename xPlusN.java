package SoloTest.Programmers;

import java.util.Arrays;

public class xPlusN {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        long[] answer = new long[n];

        for(int i=0;i<n;i++){
//            answer[i] = x;
//            x += (int) answer[0];
            answer[i] = x * (i+1);
        }
        System.out.println(Arrays.toString(answer));
    }
}
