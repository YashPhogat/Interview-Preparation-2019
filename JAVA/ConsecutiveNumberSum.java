import java.util.*;

class Solution_ConsecutiveNumberSum {
    public int consecutiveNumbersSum(int N) {
        int count = 1;

        for(int i = 2; i<=Math.sqrt(2*N); i++){
            if (((N-(i*(i-1))/2)%i == 0)){
                count++;
            }
        }
        return count;
    }
}


public class ConsecutiveNumberSum {
    public static void main(String[] args) {
        int num = 1000000000;
        Solution_ConsecutiveNumberSum obj1 = new Solution_ConsecutiveNumberSum();
        int result;
        result = obj1.consecutiveNumbersSum(num);
        System.out.println(result);
    }
}
