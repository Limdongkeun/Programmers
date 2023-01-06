package SoloTest.Programmers;

import java.util.Stack;

public class hamBuger {
  public static int solution(int[] ingredient) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i=0;i<ingredient.length;i++){
      stack.push(ingredient[i]);
  
      if (stack.size() >= 4) {
        System.out.println(stack.size());
        if(stack.get(stack.size()-4)==1
                && stack.get(stack.size()-3) == 2
                && stack.get(stack.size()-2) == 3
                && stack.get(stack.size()-1) == 1){
          answer++;
          stack.pop();
          System.out.println(stack.size());
          stack.pop();
          System.out.println(stack.size());
          stack.pop();
          System.out.println(stack.size());
          stack.pop();
          System.out.println(stack.size());
        }
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
    System.out.println(solution(ingredient));
  }
}
