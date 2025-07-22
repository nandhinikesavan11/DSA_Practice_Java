package ArraysAndHashing.medium;
import java.util.Arrays;
/*
 * intuition: 
 * use three pointers for l, m and r. Keep l,m at  zeroth index and r and last index
 * if element is one swap with l and increment both l and m
 * if element is two swap with r and decrement r
 * else increment m
 */

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while (mid <= right){
            if (nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left]  = temp;
                left++;
                mid++;
            }
            else if (nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right]  = temp;
                right--;
            }
            else { 
                mid++;
            }
        }
    }
}
