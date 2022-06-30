package SoloTest.Programmers;

import java.util.Arrays;

public class smallNumDelete {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};
        int[] answer = new int[arr.length-1];

        int small = arr[0];

        for(int i=0;i<arr.length;i++){
            if(small > arr[i]){
                small = arr[i];
            }
        }

        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(small == arr[i]){
                continue;
            }else{
                answer[index++] = arr[i];
            }
        }
        System.out.println("smallNum = " + small);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
