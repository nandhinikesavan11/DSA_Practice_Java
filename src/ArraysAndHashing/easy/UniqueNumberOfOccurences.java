package ArraysAndHashing.easy;
import java.util.HashMap;
import java.util.HashSet;


public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));

    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i : arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val : mp.values()){
            if(set.contains(val)){
                return false;
            }
            set.add(val);
        }
        return true;
    }
}
