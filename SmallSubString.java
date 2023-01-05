package SoloTest.Programmers;

public class SmallSubString {
  public int solution(String t, String p) {
    int len = p.length();
    long num = Long.parseLong(p);
    int answer =0;
  
    for (int i = 0; i <= t.length() - len; i++) {
      long diff = Long.parseLong(t.substring(i, i + len));
      if (diff<=num){
        answer++;
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    SmallSubString smallSubString = new SmallSubString();
    System.out.println(smallSubString.solution("3141592", "271"));  // 2
    System.out.println(smallSubString.solution("500220839878", "7"));  // 8
    System.out.println(smallSubString.solution("10203", "15"));  // 3
  }
}
