package Stacks;
import java.util.Stack;

public class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if (s2.empty()){
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        if (s2.empty()){
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    // Driver Code
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        
        q.push(10);
        q.push(20);
        q.push(30);
        
        System.out.println("Front element: " + q.peek()); // 10
        System.out.println("Popped element: " + q.pop()); // 10
        
        System.out.println("Front element: " + q.peek()); // 20
        System.out.println("Is queue empty? " + q.empty()); // false
        
        q.pop();
        q.pop();
        System.out.println("Is queue empty? " + q.empty()); // true
    }
}
