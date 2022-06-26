package SoloTest.Programmers;

import java.util.Arrays;

public class numnerim {
    public static void main(String[] args) {

        long n = 118372;

        String str = String.valueOf(n);

        int[] answer = new int[str.length()];

        Arrays.sort(answer);

        for(int i=0;i< answer.length;i++){
            answer[i] += str.charAt(i)-'0';
        }

        String a = Arrays.toString(answer);
        System.out.println("answer = " + a);


    }
}
