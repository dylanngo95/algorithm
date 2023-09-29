package stack;

import java.util.Stack;

public class MonotonicStack {

    public Stack<Integer> getNextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() >= num) {
                stack.pop();
            }
            stack.push(num);
        }
        return stack;
    }
}
