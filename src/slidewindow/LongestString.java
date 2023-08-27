package slidewindow;

import java.util.HashMap;

public class LongestString {

    public int lengthOfLongestSubstring(String s) {

        int left = 0; int right = 0;
        int size = s.length();
        int result = 0;
        HashMap<Character, Integer> mapFrequent = new HashMap<>();

        while (right < size) {

            Character key = Character.valueOf(s.charAt(right));
            Character keyLeft = Character.valueOf(s.charAt(left));

            mapFrequent.put(
                    key,
                    mapFrequent.getOrDefault(key, 0) + 1
            );

            if (right - left + 1 != mapFrequent.size()) {
                mapFrequent.put(
                        keyLeft,
                        mapFrequent.getOrDefault(keyLeft, 0) - 1
                );

                if (mapFrequent.get(keyLeft) == 0) {
                    mapFrequent.remove(keyLeft);
                }

                left++;
            }

            if (right - left + 1 == mapFrequent.size()) {
                result = Math.max(result, right - left + 1);
            }

            right++;
        }

        return result;
    }
}
