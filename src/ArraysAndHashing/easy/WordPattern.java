package ArraysAndHashing.easy;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {
        char[] pat = pattern.toCharArray();
        String[] arr = s.split(" ");
        if(pat.length != arr.length) return false;

        HashMap<Character,String> mp1 = new HashMap<>();
        HashMap<String,Character> mp2 = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            char c = pat[i];
            String word = arr[i];
            if(mp1.containsKey(c) && !mp1.get(c).equals(word)){
                return false;
            }
            if(mp2.containsKey(word) && !mp2.get(word).equals(c)){
                return false;
            }
            if(!mp1.containsKey(c) && !mp2.containsKey(word)){
                mp1.put(c,word);
                mp2.put(word,c);
            }  
        }
        return true;
    }

}
