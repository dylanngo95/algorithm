package stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanner {
    Stack<int[]> stack = new Stack<>();
    public StockSpanner() {

    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && price > stack.peek()[0]) {
            span += stack.pop()[1];
        }

        stack.push(new int[] {price, span});

        return span;
    }
}
