package ArraysAndHashing.Easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            int rem = target - nums[i];
            if (map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(nums[i],i);
        }
        return new int[-1];
    }
}
