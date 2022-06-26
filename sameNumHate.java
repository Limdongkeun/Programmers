package SoloTest.Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class sameNumHate {
    public static void main(String[] args) {
        //방법1
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer1 = new int[]{};

        int j=0;
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length-1];

        answer1 = new int[j];
        for(int i=0;i<j;i++){
            answer1[i] = temp[i];
        }

        System.out.println("answer1 = " + Arrays.toString(answer1));


        //방법2
        ArrayList<Integer> arrayList = new ArrayList<>();
        int num = -1;
        int[] answer2 = new int[]{};

        for(int i=0;i< arr.length;i++){
            if(arr[i] != num){
                arrayList.add(arr[i]);
                num = arr[i];
            }
        }
        answer2 = new int[arrayList.size()];
        for(int i =0; i< answer2.length;i++){
            answer2[i] = arrayList.get(i);
        }
        System.out.println("Arrays.toString(answer2) = " + Arrays.toString(answer2));
    }
}
