package slidewindow;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationString {

    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();
        int arrS1[] = new int[128];
        for (Character c : s2.toCharArray()) {
            int keyChar = (int) c;
            arrS1[keyChar]++;
        }

        int left = 0; int right = 0;
        int size = s2.length();

        int arrS2[] = new int[128];

        while (right < size) {

            int keyChar2 = (int) s2.charAt(right);
            arrS2[keyChar2]++;

            if (right - left + 1 > k) {
                int keyChar2L = (int) s2.charAt(left);
                arrS2[keyChar2L]--;
                left++;
            }

            if (right - left + 1 == k && areEqual(arrS2, arrS1)) {
                return true;
            }

            right++;
        }

        return false;
    }

    private boolean areEqual(int[] first, int[] second) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) return false;
        }
        return true;
    }

}
