package twopoiter;

public class Rotate {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int count = 3;
        while (count > 0) {
            rotateOne(nums, n);
            count--;
        }

    }

    private int[] rotateOne(int[] nums, int n) {
        int[] newArr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            newArr[i+1] = nums[i];
        }
        newArr[0] = nums[n - 1];
        return newArr;
    }

}
