package SoloTest.Programmers;

public class Kim {
    public static String findKim(String[] str) {
        String ans = "";
        int i = 0;
        int idx = 0;
        for (i = 0; i < str.length; i++) {
            if (str[i].equals("Kim")) {
                idx = i;
            }
        }
        ans = "김서방은 " + idx + "에 있다";
        return ans;
    }

    public static void main(String[] args) {
//        String[] str = ;
        System.out.println(findKim(new String[]{"Jane", "Kim"}));
    }
}
