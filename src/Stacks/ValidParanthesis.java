package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "({]})";
        System.out.println(isValid(s));

    }
     public static boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if ((c == '(') || (c== '{') || (c == '[')){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
                
            }
            
        }
        
        return st.isEmpty();
    }
}
