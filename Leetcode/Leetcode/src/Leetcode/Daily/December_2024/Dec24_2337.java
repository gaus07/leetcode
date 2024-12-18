package Leetcode.Daily.December_2024;
//Question Name - Move Pieces to Obtain a String
public class Dec24_2337 {
    static boolean canChange(String start, String target) {
        int n = start.length(), l = 0, r = 0;

        while (l < n || r < n) {
            while (l < n && start.charAt(l) == '_') l++;
            while (r < n && target.charAt(r) == '_') r++;

            if (l == n || r == n) return l == n && r == n;
            if (start.charAt(l) != target.charAt(r)) return false;

            if (start.charAt(l) == 'L' && l < r) return false;
            if (start.charAt(l) == 'R' && l > r) return false;

            l++; r++;
        }
        return true;
    }
    public static void main(String[] args) {
        String start = "_L__R__R_", target = "L______RR";
        System.out.println(canChange(start, target));
    }
}
