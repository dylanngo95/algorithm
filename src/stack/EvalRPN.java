package stack;

import java.util.Stack;

public class EvalRPN {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            switch (token) {
                case "+" :
                    stack.add(stack.pop() + stack.pop());
                    break;
                case "-" :
                    Integer first = stack.pop();
                    Integer second = stack.pop();
                    stack.add(second - first);
                    break;
                case "/" :
                    Integer firstDiv = stack.pop();
                    Integer secondDiv = stack.pop();
                    stack.add(secondDiv / firstDiv);
                    break;
                case "*" :
                    stack.add(stack.pop() * stack.pop());
                    break;
                default:
                    stack.add(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}
