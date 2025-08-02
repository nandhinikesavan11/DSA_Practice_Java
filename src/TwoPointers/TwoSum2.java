package TwoPointers;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum2(numbers,target)));

    }
    public static int[] twoSum2(int[] numbers,int target){
        int l = 0;
        int r  = numbers.length-1;
        while (l<r){
            int tot = numbers[l]+numbers[r];
            if(tot == target){
                return new int[]{l+1,r+1};
            }
            else if(tot<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{-1,-1};
    }
}
