package SoloTest.Programmers;

public class secret {
    public static String idx(String s, int n) {
        long before = System.currentTimeMillis();
        String answer = "";
        int size = s.length();

        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] == ' ') continue;
            for (int j = 1; j <= n; j++) {
                if (arr[i] == 'z') {
                    arr[i] = 'a';
                    continue;
                } else if (arr[i] == 'Z') {
                    arr[i] = 'A';
                    continue;
                }
                arr[i] = (char) (arr[i] + 1);
            }
        }
        long after = System.currentTimeMillis();
        long sec = (before - after)/1000;
        answer = new String(arr);

        System.out.println("sec = " + sec);
        return answer;


//        String result = "";
//        for(int i=0; i < s.length(); i++) {
//            if(s.charAt(i) == ' ') {
//                result += " ";
//                continue;
//            }
//            char tmp = s.charAt(i);
//            int asc;
//            if(Character.isUpperCase(tmp)) {
//                asc = tmp + n;
//                if(asc > 90) asc = 64 + (asc - 90);
//            }else {
//                asc = tmp + n;
//                if(asc > 122) asc = 96 + (asc - 122);
//            }
//            result = result + Character.toString((char)asc);
//        }
//        return result;
    }

    public static void main(String[] args) {



        System.out.println(idx("ABC", 3));;
    }
}
