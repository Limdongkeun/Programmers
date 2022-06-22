package SoloTest.Programmers;

public class UpperCase {
    public static void main(String[] args) {
        String s = "try hello world";

        String answer = "";
        String[] str = s.split("");
        System.out.println("str = " + str[0]);
        int idex =0;

        for (int i=0;i< str.length;i++){
            if(str[i].equals(" ")){
                idex=0;
            } else if (idex%2==0) {
                str[i] = str[i].toUpperCase();
                idex++;
            } else if (idex%2 != 0) {
                str[i] = str[i].toLowerCase();
                idex++;
            }
            System.out.println("str = " + str[i]);
            answer += str[i];
        }

        System.out.println("answer = " + answer);
    }
}
