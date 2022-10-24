package SoloTest.Programmers;

public class strReverse {
    public static String solution(String my_string){
        long start = System.currentTimeMillis();
        String answer = "";
        for (int i = my_string.length()-1;i >=0;i--){
            answer += my_string.charAt(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
        return answer;

    }

    public static String solution2(String my_string){
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
        return sb.toString();
    }

    public static String solution3(String my_string){
        long start = System.currentTimeMillis();
        StringBuffer words = new StringBuffer(my_string);
        String answer = words.reverse().toString();
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ABCDE"));
        System.out.println(solution2("ABCDE"));
        System.out.println(solution3("ABCDE"));
    }
}
