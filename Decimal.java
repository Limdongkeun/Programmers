package SoloTest.Programmers;

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean[] sosu = new boolean[num+1];
        int answer=0;

        for (int i=2;i<=num;i++){
            sosu[i] = true;
        }

        int root = (int)Math.sqrt(num);

        for (int i=2;i<=root;i++){
            if(sosu[i] == true){
                for(int j=i; i*j<=num;j++){
                    sosu[i*j]=false;
                }
            }
        }
        for(int i=2;i<=num;i++){
            if(sosu[i]==true){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
