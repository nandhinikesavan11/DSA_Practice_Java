package ArraysAndHashing.easy;
import java.util.Arrays;
/*
 * Intuition:
 * - Sort the array of strings.
 * - Compare the first and last strings in the sorted array.
 * - The common prefix between these two strings will be the longest common prefix for the entire array.    
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String t = strs[strs.length - 1];
        int i = 0;
        String result = "";
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) {
            result += s.charAt(i);
            i++;
        }
        
        return result;
    }
}
