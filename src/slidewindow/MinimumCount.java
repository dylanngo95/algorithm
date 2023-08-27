package slidewindow;

public class MinimumCount {

    public int minimumCount(int[] nums, int k) {

        int numLength = nums.length;
        int left = 0; int right = 0;
        int count  = 0;
        int result = 0;

        if (numLength == 0) return 0;

        while (right < numLength) {

            count += nums[right];

            while (count > k) {
                count -= nums[left];
                left++;
            }

            if (count == k) {
                if (result > 0) {
                    result = Math.min((right - left + 1), result);
                }
                result = right - left + 1;
            }

            right++;
        }

        return result;
    }
}
