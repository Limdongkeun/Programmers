package SoloTest.Programmers;

import java.util.Scanner;

public class isDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        boolean ok = true;

        if(str.length() !=4 && str.length()!= 6){
            ok = false;
        }


        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                ok = false;
            }
        }
        System.out.println(ok);
    }
}
