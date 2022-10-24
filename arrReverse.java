package SoloTest.Programmers;

import java.util.Arrays;

public class arrReverse {
    public static int[] solution(int[] num_list){
        long start = System.currentTimeMillis();

        int[] answer = new int[num_list.length];
        for(int i = num_list.length -1;i>=0;i--){
            answer[i] += num_list[num_list.length-i-1];
        }

        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }
}
