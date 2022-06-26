package SoloTest.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        long n = 12345;
//         방법 1
//        int cnt = 0;
//        long num = n;
//
//        while(num !=0 ){
//            num /= 10;
//            cnt++;
//        }
//        int[] answer = new int[cnt];
//
//        num = n;
//        for(int i = 0; num != 0; i++){
//            answer[i] = (int)(num % 10);
//            num /= 10;
//        }
//
//        System.out.println("answer = " + Arrays.toString(answer));

        //방법 2
        String a = "" + n;
        int[] answer5 = new int[a.length()];
        int cnt5=0;

        while(n>0) {
            answer5[cnt5]=(int)(n%10);
            n/=10;
//            System.out.println(n);
            cnt5++;
        }

        System.out.println("answer5 = " + Arrays.toString(answer5));

        //방법 3
//        List<Integer> list = new ArrayList<>();
//        while(n != 0) {
//            list.add((int)(n % 10));
//            n /= 10;
//        }
//        int[] answer1 = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            answer1[i] = list.get(i);
//        }
//        System.out.println("answer = " + Arrays.toString(answer1));

        //방법 4
//        String s = "" + n;
//        int[] answer2 = new int[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            answer2[i] = s.charAt(s.length() - i - 1) - '0';
//        }
//        System.out.println("answer2 = " + Arrays.toString(answer2));
    }
}
