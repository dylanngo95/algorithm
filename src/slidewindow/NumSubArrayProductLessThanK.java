package slidewindow;

public class NumSubArrayProductLessThanK {

    public int numSubArrayProductLessThanK(int[] nums, int k) {
        int size = nums.length;
        int left = 0; int right = 0;

        int product = 1;
        int count = 0;

        while (right < size) {

            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;

            right++;
        }

        return count;
    }
}
