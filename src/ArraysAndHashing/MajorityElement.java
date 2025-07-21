package ArraysAndHashing;

import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
    
        
    public static int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map  =  new HashMap<>();  
    int n = nums.length;
    for (int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }

    for (Integer i : map.keySet()){
        if (map.get(i) >n/2){
            return i;
        }
    }
    return -1;  
    }
    
    
}
