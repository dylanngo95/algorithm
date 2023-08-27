package slidewindow;

import java.util.ArrayList;
import java.util.List;

public class CountNegative {

    public List<Integer> countNegative(int[] nums, int k) {

        int numLength = nums.length;
        int left = 0;
        int right = 0;
        List<Integer> result = new ArrayList<>();
        int countNegative = 0;

        while (right < numLength) {

            if (nums[right] < 0) {
                countNegative++;
            }

            if (right - left + 1 > k) {
                if(nums[left] < 0) {
                    countNegative--;
                }
                left++;
            }

            if(right - left + 1 == k) {
                result.add(countNegative);
            }
            right++;
        }

        return result;
    }
}
