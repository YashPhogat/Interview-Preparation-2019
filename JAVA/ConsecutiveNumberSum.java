import java.util.*;

class Solution_ConsecutiveNumberSum {
    public int consecutiveNumbersSum(int N) {

        int right, left;
        right =  N/2 + 1;
        left = right - 1;
        int count = 0;
        int curr_sum = left + right ;
        while (left > 0 && right > Math.sqrt(N)){
            if (curr_sum == N){
                count +=1;
                left--;
                right--;
                curr_sum = curr_sum-2;
//                System.out.println("Left:" + left + "; Right:" + right);
            }
            else if (curr_sum > N){
                curr_sum = curr_sum - right;
                right--;
            }
            else if (curr_sum < N){
                left --;
                curr_sum = curr_sum + left;
            }
        }

        return count;
    }
}


public class ConsecutiveNumberSum {
    public static void main(String[] args) {
        int num = 333764327;
        Solution_ConsecutiveNumberSum obj1 = new Solution_ConsecutiveNumberSum();
        int result;
        result = obj1.consecutiveNumbersSum(num);
        System.out.println(result);
    }
}
