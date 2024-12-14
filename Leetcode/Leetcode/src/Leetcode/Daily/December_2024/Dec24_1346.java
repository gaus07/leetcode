package Leetcode.Daily.December_2024;
import java.util.*;

//Question Name - Check If N and Its Double Exist
public class Dec24_1346 {
    static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) mp.put(i, mp.getOrDefault(i, 0) + 1);

        for (int i : arr) {
            if (i != 0 && mp.containsKey(2 * i) || i == 0 && mp.get(i) > 1) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
}
