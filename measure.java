package SoloTest.Programmers;

public class measure {
    public static void main(String[] args) {
        int a =12;
        int result =0;

        for(int i=1;i<=a;i++){
            if(a%i==0){
                result += i;
            }
        }
        System.out.println("result = " + result);
    }
}
