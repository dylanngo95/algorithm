package slidewindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {

        int k = p.length();

        int left = 0; int right = 0;
        int size = s.length();
        int count = p.length();

        List<Integer> result = new ArrayList<>();
        char[] arraySource = s.toCharArray();

        int[] mapPFrequent = new int[128];
        for (Character cP : p.toCharArray()) {
            mapPFrequent[(int) cP]++;
        }

        while (right < size) {

            if (mapPFrequent[arraySource[right]]-- > 0) {
                count--;
            }

            if (count == 0) {
                result.add(left);
            }

            if (right - left == p.length()
                    && mapPFrequent[arraySource[left++]] >= 0
            ) {
                count++;
            }

            right++;
        }

        return result;

    }

}
