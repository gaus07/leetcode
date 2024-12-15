package Leetcode.Daily.December_2024;
//Question Name - Adding Spaces to a String

public class Dec24_2109 {
    static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (c < spaces.length && i == spaces[c]) {
                sb.append(" ");
                c++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn"; int[] spaces = {8,13,15};
        System.out.println(addSpaces(s, spaces));
    }
}
