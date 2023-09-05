package twopoiter;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        int size = numbers.length;
        int left = 0; int right = size - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] {left+1, right+1};
    }
}
