package Stacks;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[]  operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));

    }
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int first = st.pop();
                int sec = st.pop();
                int elem = first+sec;
                st.push(sec);
                st.push(first);
                st.push(elem);
            }
            else if(s.equals("D")){
                int top= st.peek();
                int val = top*2;
                st.push(val);
            }
            else if(s.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!st.empty()){
            sum+=st.pop();
        }
        return sum;
    }
}
