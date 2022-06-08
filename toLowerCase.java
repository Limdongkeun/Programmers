package SoloTest.Programmers;

import java.util.Scanner;

public class toLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int pcount=0;
        int ycount=0;
        String lowerStr = str.toLowerCase();

        for(int i=0;i<lowerStr.length();i++){
            if(lowerStr.charAt(i)=='p'){
                pcount++;
            }
            if(lowerStr.charAt(i)=='y'){
                ycount++;
            }
        }
        if(pcount==ycount){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
