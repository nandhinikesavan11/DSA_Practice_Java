package TwoPointers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  


public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-4, -1, -1, 0, 1, 2};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if( nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
           
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]){
                    j++;
                    } 
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    } 
                }
                else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(list);
    }
}   