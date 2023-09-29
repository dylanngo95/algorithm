package stack;

import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums) {

        int[] array = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                array[stack.peek()] = nums[i];
                stack.pop();
            }
            stack.push(i);
        }
        return array;

    }
}
