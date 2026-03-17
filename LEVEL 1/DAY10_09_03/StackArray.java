import java.util.Scanner;

class StackArray {
    int stack[];
    int top;
    int size;
    // Constructor
    StackArray(int n) {
        size = n;
        stack = new int[size];
        top = -1;
    }
    // PUSH operation
    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = x;
            System.out.println("Pushed: " + x);
        }
    }
    // POP operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    // PEEK operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }
    // DISPLAY operation
    void display() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArray s = new StackArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.peek();
        s.display();
    }
}