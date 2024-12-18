package Leetcode.Daily.December_2024;
import java.util.HashSet;
//Question Name - Maximum Number of Integers to Choose From a Range I

public class Dec24_2554 {
    static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : banned) hs.add(i);

        int sum = 0, c = 0;
        for (int i = 1; i <= n; i++) {
            if (sum + i <= maxSum && !hs.contains(i)) {
                sum += i;
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] banned = {1,6,5}; int n = 5, maxSum = 6;
        System.out.println(maxCount(banned, n, maxSum));
    }
}
