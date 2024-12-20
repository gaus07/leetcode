package Leetcode.Daily.December_2024;
import java.util.Arrays;
import java.util.function.BiFunction;

//Question Name - Minimum Limit of Balls in a Bag

public class Dec24_1760 {
    static int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();
        int res = r;

        BiFunction<Integer, Integer, Boolean> check = (maxOpe, m) -> {
            int totalOpe = 0;

            for (int i : nums) {
                int ope = i / m;
                if (i % m == 0) ope -= 1;
                totalOpe += ope;
            }
            return totalOpe <= maxOpe;
        };

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (check.apply(maxOperations, m)) {
                res = m;
                r = m - 1;
            } else l = m + 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,8,2}; int maxOperations = 4;
        System.out.println(minimumSize(nums, maxOperations));
    }
}
