package SoloTest.Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class participant {
//  public static String solution(String[] participant, String[] completion) {
//    String answer = "";
//    Arrays.sort(participant);
//    Arrays.sort(completion);
//    int i;
//    for ( i=0; i<completion.length; i++){
//      if (!participant[i].equals(completion[i])){
//        return participant[i];
//      }
//    }
//    answer = participant[i];
//    return answer;
//  }
  
  public static String solution(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> hm = new HashMap<>();
    for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
    System.out.println(hm.toString());
    for (String player : completion) hm.put(player, hm.get(player) - 1);
    System.out.println(hm.toString());
    
    for (String key : hm.keySet()) {
      if (hm.get(key) != 0){
        answer = key;
        System.out.println(hm.toString());
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};
    System.out.println(solution(participant, completion));
  }
  
}
