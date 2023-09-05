package slidewindow;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> result = new ArrayList<>();

        int size = arr.length;
        int left = 0; int right = size - 1;

        while (right - left + 1 > k) {
            int rightValue = Math.abs(x - arr[right]);
            int leftValue = Math.abs(x - arr[left]);
            if (rightValue >= leftValue) {
                right--;
            } else  {
                left++;
            }
        }

        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
