package slidewindow;

public class MaxProfit {

    public int maxProfit(int[] prices) {

        int size = prices.length;

        int left = 0; int right = 0;

        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        int result = 0;

        while(right < size) {

            if (min > prices[right]) {
                min = prices[right];
                max = 0;
                left = right;
            }

            if (max <= prices[right] && left < right) {
                max = prices[right];
                result = Math.max(result, max - min);
            }

            right++;
        }

        return result;

    }
}
