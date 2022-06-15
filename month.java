package SoloTest.Programmers;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int select = 0;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0;i<a-1;i++){
            select += date[i];
        }
        select += b-1;

        System.out.println(day[select%7]);
    }
}
/*
2016.1월 1일은 금요일
2016.1월 2일은 토요일
 */