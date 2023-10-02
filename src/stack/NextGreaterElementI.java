package stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

    Stack<Integer> stack = new Stack<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int num: nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;
        }

        return nums1;
    }

}
