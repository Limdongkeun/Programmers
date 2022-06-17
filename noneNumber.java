package SoloTest.Programmers;

import java.util.Arrays;

public class noneNumber {
    public static void main(String[] args) {
        int num =45;
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};

        for(int i : numbers){
            num -= i;
        }
        System.out.println("num = " + num);
    }
}
