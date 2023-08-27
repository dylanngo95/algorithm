package slidewindow;

import java.util.HashMap;

public class MaximumAverageSub {

    public double findMaxAverage(int[] nums, int k) {

        int numSize = nums.length;
        int left = 0; int right = 0;
        int averageCount = 0;
        int maxAverage = Integer.MIN_VALUE;

        while (right < numSize) {

            int window = right - left + 1;

            averageCount += nums[right];

            if (window > k) {
                averageCount -= nums[left];
                left++;

                window = right - left + 1;
            }

            maxAverage = Math.max(averageCount, maxAverage);

            right++;
        }

        return (double) maxAverage / k;
    }

}
