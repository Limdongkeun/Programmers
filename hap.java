package SoloTest.Programmers;

import java.util.Scanner;

public class hap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a;
        int min = b;
        long result =0;

        if(a<b){
            max=b;
            min=a;
        }

        if(a==b){
            System.out.println(a);
        }

        for(int i=min;i<=max;i++){
            result += i;
        }

        System.out.println(result);
    }
}
