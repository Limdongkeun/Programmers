package SoloTest.Programmers;

public class stringSplit {
  
  public static int solution(String s){
    char first = s.charAt(0);
    int count =0;
    int diff =0;
    int answer =0;
    
    for (int i=0;i<s.length();i++){
      if (count == diff){
        answer++;
        first = s.charAt(i);
      }
      if (first == s.charAt(i)){
        count++;
      }else {
        diff++;
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    System.out.println(solution("banana"));
  }
}
