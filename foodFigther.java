package SoloTest.Programmers;

public class foodFigther {
  public static String solution(int[] food){
    String answer = "";
    
    StringBuilder sb = new StringBuilder();
    
    for (int i = 1;i<food.length;i++){
      int half = food[i]/2;
      
      for (int j=0;j<half;j++){
        sb.append(i);
      }
    }
    answer = sb.toString() + "0" + sb.reverse().toString();
    return answer;
  }
  
  public static void main(String[] args) {
    int[] food = {1, 3, 4, 6};
    System.out.println(solution(food));
    int i=0;
    System.out.println(food[i]);
  }
}
