package SoloTest.Programmers;

import java.util.Arrays;
import java.util.Collections;

public class strDescending {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        //방법 1
        String[] answer = s.split("");
        String str = "";
        Arrays.sort(answer, Collections.reverseOrder());
        for(int i=0;i<answer.length;i++){
            str += answer[i];
        }
        System.out.println(str);

        //방법 2
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr,0, arr.length));
        System.out.println(sb.reverse().toString());

        //방법 3
        Character[] arr2 = new Character[s.length()];
        for(int i=0;i< arr2.length;i++){
            arr2[i] = s.charAt(i);
        }
        Arrays.sort(arr2,Collections.reverseOrder());
        s = "";
        for (int i=0;i< arr2.length;i++){
            s += arr2[i];
        }
        System.out.println(s);
    }
}







/**
 *         StringBuilder stringBuilder = new StringBuilder();
 *         stringBuilder.append("문자열 ").append("연결");
 * //        String str = stringBuilder;   // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
 *         String str = stringBuilder.toString();
 *         // 두 println()은 같은 값을 출력한다
 *         System.out.println(stringBuilder);
 *         System.out.println(str);
 */