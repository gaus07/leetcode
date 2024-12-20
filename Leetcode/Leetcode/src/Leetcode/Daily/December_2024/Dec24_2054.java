package Leetcode.Daily.December_2024;
import java.util.Arrays;

//Question Name - Two Best Non-Overlapping Events

public class Dec24_2054 {
    static int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int[] maxVal = new int[n];
        maxVal[n - 1] = events[n - 1][2];
        for (int i = n - 2; i >= 0; i--) maxVal[i] = Math.max(maxVal[i + 1], events[i][2]);

        int res = 0;
        for (int i = 0; i < n; i++) {
            int currVal = events[i][2];
            res = Math.max(res, currVal);

            int l = i, h = n - 1, nxtVal = -1;
            while (l <= h) {
                int m = l + (h - l) / 2;
                if (events[m][0] > events[i][1]) {
                    nxtVal = m;
                    h = m - 1;
                } else l = m + 1;
            }
            if (nxtVal != -1) res = Math.max(res, currVal + maxVal[nxtVal]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] events = {{1,3,2},{4,5,2},{2,4,3}};
        System.out.println(maxTwoEvents(events));
    }
}
