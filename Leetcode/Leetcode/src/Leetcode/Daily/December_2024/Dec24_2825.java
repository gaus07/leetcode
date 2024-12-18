package Leetcode.Daily.December_2024;
//Question Name - Make String a Subsequence Using Cyclic Increments
public class Dec24_2825 {
    static boolean canMakeSubsequence(String str1, String str2) {
        int l = 0, r = 0;

        while (l < str1.length() && r < str2.length()) {
            if (str1.charAt(l) == str2.charAt(r) || str1.charAt(l) + 1 == str2.charAt(r) || str1.charAt(l) - 25 == str2.charAt(r)) {
                r++;
                if (r == str2.length()) return true;
            }
            l++;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abc", str2 = "ad";
        System.out.println(canMakeSubsequence(str1, str2));
    }
}
