package slidewindow;

import java.util.HashMap;

public class LongestRepeatingChar {

    public int characterReplacement(String s, int k) {

        int size = s.length();
        int left = 0; int right = 0;
        HashMap<Character, Integer> mapFrequent = new HashMap<>();
        int result = Integer.MIN_VALUE;

        int maxCharCount = Integer.MIN_VALUE;

        while (right < size) {

            Character keyR = Character.valueOf(s.charAt(right));
            mapFrequent.put(
                    keyR,
                    mapFrequent.getOrDefault(keyR, 0) + 1
            );

            maxCharCount = Math.max(maxCharCount, mapFrequent.get(keyR));

            if (right - left + 1 - maxCharCount == k) {
                result = Math.max(right - left + 1, result);
                left++;
            }

            right++;
        }

        return result;
    }
}
