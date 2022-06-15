package SoloTest.Programmers;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min =0;


        for(int i=1;i<n;i++){
            if(n%i==1){
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}
