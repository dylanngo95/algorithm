package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[nums.length];

        Arrays.fill(result, -1);

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        return result;
    }
}
