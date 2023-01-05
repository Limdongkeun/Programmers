package SoloTest.Programmers;

public class Rectangle {
  public static int[] solution(int[][] v){
    int x = 0;
    int y = 0;
    int[] answer = {x,y};
  
    if(v[2][0]==v[0][0]){
      x=v[1][0];
    }else if(v[1][0]==v[2][0]){
      x=v[0][0];
    }else{
      x=v[2][0];
    }
  
  
    if(v[1][1]==v[0][1]){
      y=v[2][1];
    }else if(v[2][1]==v[1][1]){
      y=v[0][1];
    }else{
      y=v[1][1];
    }
    return answer;
  }
  
  public static void main(String[] args) {
  }
}
