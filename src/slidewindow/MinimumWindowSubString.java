package slidewindow;

import java.util.HashMap;

public class MinimumWindowSubString {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int arrT[] = new int[128];
        for (Character cT: t.toCharArray()) {
            arrT[cT]++;
        }

        int right = 0; int left = 0;
        int size = s.length();

        char[] sourceArr = s.toCharArray();

        int count = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right < size) {

            arrT[sourceArr[right]]--;
            if (arrT[sourceArr[right]] >= 0) {
                count++;
            }

            while (count == t.length()) {

                if (right - left + 1 < minLength) {
                    minLeft = left;
                    minLength = right - left + 1;
                }

                arrT[sourceArr[left]]++;
                if (arrT[sourceArr[left]] > 0) {
                    count--;
                }

                left++;
            }


            right++;
        }

        if (minLength > s.length()) return "";

        return s.substring(minLeft, minLeft + minLength);
    }

}
