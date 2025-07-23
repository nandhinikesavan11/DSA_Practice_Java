package ArraysAndHashing.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > nums.length/3){
                res.add(entry.getKey());
            }
        }
        return res;
        
    }
}
