package SoloTest.Programmers;

public class centerStr {
    public static void main(String[] args) {
        String str = "abcdef";

        String answer = "";

        if(str.length()%2==0){
            answer += str.charAt(str.length()/2-1);
            answer += str.charAt(str.length()/2);
        }else {
            answer += str.charAt(str.length()/2);
        }
        System.out.println(answer);
        System.out.println(str.charAt(str.length()/2));
        System.out.println(str.length()/2);
    }
}
