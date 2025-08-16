package Stacks;
import java.util.Stack;

public class EvaluateRPN{
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));

    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.matches("-?\\d+")){
                st.push(Integer.parseInt(s));
            }else{
                int sec = st.pop();
                int first = st.pop();
                switch (s) {
                    case "+":
                        st.push(first+sec);
                        break;
                    case "-":
                        st.push(first-sec);
                        break;
                    case "*":
                        st.push(first*sec);
                        break;
                    case "/":
                        st.push(first/sec);
                        break;
                }
            }    
        }
        return st.pop();
    }
}
