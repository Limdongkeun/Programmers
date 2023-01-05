package SoloTest.Programmers;

import java.util.Scanner;

public class star {
  public static void solution(int num){
    String s = "*";
    for (int i=0;i<num;i++){
      for (int j=0;j<=i;j++){
        System.out.print(s);
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    solution(3);
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
  
    System.out.println(a);
  }
}
