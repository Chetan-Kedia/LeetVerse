import java.util.*;
class PostfixEvaluation
{
    public static int evaluate(String exp)
    {
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(Character.isDigit(ch))
            {
                s.push(ch-'0');
            }
            else {
                int operand2 = s.pop();
                int operand1 = s.pop();
                switch (ch) {
                    case '+': {
                        s.push(operand1 + operand2);
                        break;
                    }
                    case '-': {
                        s.push(operand1 - operand2);
                        break;
                    }
                    case '*': {
                        s.push(operand1 * operand2);
                        break;
                    }
                    case '/': {
                        s.push(operand1 / operand2);
                        break;
                    }
                }
            }
        }
        return s.pop();
    }

    public static void main(String[] args)
    {
        String exp= "562+*84/-";
        System.out.println(evaluate(exp));
    }
}

postfix evaluation code