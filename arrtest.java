package SoloTest.Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class arrtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];
        int[] answer = new int[]{};

        int divisor = sc.nextInt();

        for(int i=0;i< arr.length;i++){
            if(arr[i]%divisor == 1){
                answer[i] += arr[i];
            }
            if(arr[i]%divisor != 1){
                System.out.println(-1);
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
//    int[] answer = {};
//    ArrayList<Integer> a1 = new ArrayList<Integer>();
//
//          for(int i=0; i<arr.length; i++) {
//        if(arr[i]%divisor==0) {
//        a1.add(arr[i]);
//        }
//        }
//
//        if(a1.isEmpty()) {
//        a1.add(-1);
//        }
//
//        answer = new int[a1.size()];
//
//        for(int i=0; i<a1.size(); i++) {
//        answer[i] = a1.get(i);
//        }
//
//        Arrays.sort(answer);
//
//        return answer;
//        }