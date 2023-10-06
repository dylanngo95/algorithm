package stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {

        if (position.length == 1) return 1;

        int[][] arr = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        Stack<Double> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            double time = (target - arr[i][0]) / (double) arr[i][1];
            if (stack.size() > 0 && stack.peek() >= time) {
                stack.push(time);
            }
            if (stack.size() <= 0) {
                stack.push(time);
            }
        }

        return stack.size();
    }

}
