package Stacks;

import java.util.Stack;

public class RemoveStarsInString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char val = s.charAt(i);
            if(val == '*'){
                st.pop();
            }
            else{
                st.push(val);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character i : st){
            sb.append(i);
        }
        return sb.toString();
    }
}
