package ArraysAndHashing.Easy;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);   // a-3, n-1, g-1, r-1, m-1
        }

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c)< 0){
                return false;
            }
        }
        return true;
    }

}
