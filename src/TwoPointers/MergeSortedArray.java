package TwoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {10,20,20,40,0,0};
        int[] nums2 = {1,2};
        int m = 4;
        int n= 2;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = n-1;
        int l = m-1;
        int e = m+n-1;
        while(l>=0 && r>=0){
            if(nums2[r]>=nums1[l]){
                nums1[e] = nums2[r];
                r--;
                
            }
            else{
                nums1[e] = nums1[l];
                l--;
            }
            e--;
        }
        while (r>=0){
            nums1[e] = nums2[r];
            e--;
            r--;
        }
        
    }
}
