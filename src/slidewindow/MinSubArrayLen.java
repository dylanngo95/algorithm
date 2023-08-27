package slidewindow;

public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {

        int left = 0; int right = 0;
        int size = nums.length;
        int sum = 0;
        int count = 0;

        while (right < size) {

            sum += nums[right];

            while (sum >= target) {

                if (count == 0) {
                    count = right - left + 1;
                }
                count = Math.min(right - left + 1, count);

                sum -= nums[left];
                left++;
            }

            right++;
        }

        return count;
    }
}
