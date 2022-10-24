package SoloTest.Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class multiples {

    public static int[] solution(int n, int[] numlist){
        long start = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i< numlist.length;i++){
            if (numlist[i]%n == 0){
                list.add(numlist[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
        return answer;
    }

    public static ArrayList<Integer> solution2(int n, int[] numlist){
        long start = System.currentTimeMillis();

        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : numlist){
            if(num%n == 0){
                answer.add(num);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,new int[]{4,5,6,7,8,9,10,11,12})));
        System.out.println(solution2(12,new int[]{2,100,120,600,12,12}));
    }
}
