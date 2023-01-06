package SoloTest.Programmers;

import java.util.Arrays;

public class k {
  public static int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length]; // 3
    int n = 0;
  
    for (int i = 0; i < commands.length; i++) {
      int k = 0;
      // new int[4] // new int[1] // new int[7]
      int[] list = new int[commands[i][1] - commands[i][0] + 1];
      // j = 2 ~ 5 / j = 4 ~ 4 / j= 1 ~ 7
      for (int j = commands[i][0]; j <= commands[i][1]; j++) {
        list[k++] = array[j - 1]; // {5,2,6,3} / {6} / {1,5,2,6,3,7,4}
      }
      Arrays.sort(list); // 오름차순 정렬 {2,3,5,6} / {6} / {1,2,3,4,5,6,7}
      answer[n++] = list[commands[i][2] - 1]; // {5,6,3}
    }
    return answer;
  }
  
  public static int[] solution2(int[] array, int[][] commands){
    int[] answer = new int[commands.length];
  
    for (int i = 0; i < commands.length; i++) {
      int[] nums = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
      
      Arrays.sort(nums);
      answer[i] = nums[commands[i][2]-1];
    }
    return answer;
  }
  
  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    System.out.println("solution  "+Arrays.toString(solution(array,commands)));
    System.out.println("solution2  "+Arrays.toString(solution2(array,commands)));
  }
}
