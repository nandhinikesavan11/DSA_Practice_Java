package SlidingWindow.easy;
import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {99,99};
        int k = 2;
        System.out.println(containsDuplicate2(nums,k));
    }
    public static boolean containsDuplicate2(int[] nums, int k) {
        if (k <= 0 || nums.length < 2) {
            return false;
        }

        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    } 
}

//brute force solution

    // public static boolean brute(int[]nums,int k){
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n && j <= i + k; j++) {
    //             if (nums[i] == nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }