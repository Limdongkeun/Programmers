package SoloTest.Programmers;

public class wallet {
  public static int solution(int[][] sizes) {
    int length = 0, height = 0;
    for (int[] card : sizes) {
      length = Math.max(length, Math.max(card[0], card[1]));
      height = Math.max(height, Math.min(card[0], card[1]));
      System.out.println(length);
      System.out.println(height);
    }
   
    int answer = length * height;
    return answer;
  }
  
  public static void main(String[] args) {
    int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
    int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7},{5,15}};
    int[][] sizes3 = {{14,4}, {19, 6}, {6, 16}, {18, 7},{7,11}};
    System.out.println("sizes1 "+solution(sizes1));
    System.out.println("sizes2 "+solution(sizes2));
    System.out.println("sizes3 "+solution(sizes3));
    
  }
}