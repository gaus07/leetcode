package Leetcode.Daily.December_2024;


import java.util.Arrays;

//Question Name - Special Array II
public class Dec24_3152 {
    static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length, q = queries.length;
        boolean[] res = new boolean[q];
        int[] check = new int[n];
        check[0] = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) check[i] = check[i - 1] + 1;
            else check[i] = check[i - 1];
        }
        int idx = 0;
        for (int[] i : queries) {
            int s = i[0];
            int e = i[1];
            if (check[e] - check[s] == 0) res[idx] = true;
            idx++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,1,2,6}; int[][] queries = {{0,4}};
        System.out.println(Arrays.toString(isArraySpecial(nums, queries)));
    }
}
