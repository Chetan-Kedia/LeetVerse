import java.util.Stack;

public class Stack_CF  {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

    
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

       
        System.out.println("Top element: " + stack.peek());

        
        System.out.println("Removed element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

       
        System.out.println("Is stack empty? " + stack.empty());

        
        System.out.println("Position of 10: " + stack.search(10));
    }
}