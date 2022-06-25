package SoloTest.Programmers;

public class Collatz {
    public static void main(String[] args) {
        long answer = 0;
        long num = 626331;
        int cnt = 0;

        while(num!=1){
            if(num%2==0){
                num = num/2;
                cnt++;
//                System.out.println("짝수 = " + num);
                continue;
            } else if (num%2!=0) {
                num = (num*3)+1;
                cnt++;
//                System.out.println("홀수 = " + num);
            }
        }
        if(cnt>=500){
            System.out.println(-1);
        }else {
            System.out.println("cnt = " + cnt);
        }
    }
}
/**
 * for(int i = 0; i < 500; ++i)
 *         {
 *             if (num == 1)
 *             {
 *                 return i;
 *             }
 *
 *             if (num % 2 == 0)
 *             {
 *                 num /= 2;
 *             }
 *             else
 *             {
 *                 num = num * 3 + 1;
 *             }
 *         }
 *
 *         return -1;
 */

/**
 * int count = 0;
 *
 *         while (num != 1)
 *         {
 *             // 500번 수행했을 경우
 *             if (count == 500)
 *             {
 *                 count = -1;
 *
 *                 break;
 *             }
 *
 *             num = num % 2 == 0 ? num / 2 : num * 3 + 1;
 *
 *             count++;
 *         }
 *
 *         return count;
 */