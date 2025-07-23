package ArraysAndHashing.medium;
import java.util.HashSet;

public class LongestCommonSequence {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println((longestConsecutive(arr)));


    }    

       public static int longestConsecutive(int[] arr) {
        int curr=0;
        int max =0;
        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
            set.add(i);
            
        for(int i:set){
            if(!set.contains(i-1)){
                curr=i;
                max = 1;
                while(set.contains(curr+1)){
                    curr++;
                    max ++;
                }
                longest=Math.max(max,longest);
            }
        }
        return longest;
    }


}
