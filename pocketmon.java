package SoloTest.Programmers;

import java.util.HashSet;

public class pocketmon {
  public static int solution(int[] nums) {
    int answer =0;
    int pick = nums.length / 2;
    HashSet<Integer> set = new HashSet<>();
    for (int i=0;i<nums.length;i++){
      set.add(nums[i]);
    }
    
    if (pick >= set.size()){
      answer = set.size();
    }else {
      answer = pick;
    }
    return answer;
  }
  
  public static void main(String[] args) {
    int[] nums = {3, 3, 3, 2, 2, 4};
    System.out.println(solution(nums));
  }
}
