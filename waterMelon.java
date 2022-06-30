package SoloTest.Programmers;

public class waterMelon {
    public static void main(String[] args) {
        String answer ="";
        int n =3;



        for(int i=0;i<n;i++){
            if(i%2==0){
                answer += "수";
            }else {
                answer += "박";
            }
        }
        System.out.println("answer = " + answer);
    }
}
