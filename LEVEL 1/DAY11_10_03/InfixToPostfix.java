import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char op) {
        switch (op) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        String expression = "A+B*C^(D*E)/S";
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        System.out.println("Symbol |      Stack      | Postfix");
        System.out.println("-------|-----------------|--------");

        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                output.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (stack.peek() != '(')
                    output.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence(stack.peek()) >= precedence(ch))
                    output.append(stack.pop());
                stack.push(ch);
            }
            System.out.printf("  %-5c| %-15s | %s%n", ch, stack.toString(), output);
        }

        while (!stack.isEmpty())
            output.append(stack.pop());

        System.out.println("\nPostfix: " + output);
    }
}