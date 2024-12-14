package Leetcode.Daily.December_2024;
//Question Name - Check If a Word Occurs As a Prefix of Any Word in a Sentence
public class Dec24_1455 {
    static int isPrefixOfWord(String sentence, String searchWord) {
        int l = 0, res = 0, n = sentence.length(), m = searchWord.length();

        while (l < n) {
            int r = 0;
            while (l < n && r < m && sentence.charAt(l) == searchWord.charAt(r)) {
                l++;
                r++;
            }
            if (r == m)
                return res + 1;
            while (l < n && sentence.charAt(l) != ' ')
                l++;

            res++;
            l++;
        }

        return -1;
    }
    public static void main(String[] args) {
        String sentence = "i love eating burger", searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }
}
