package slidewindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindRepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {

        int k = 10;
        char[] arrSource = s.toCharArray();
        int size = arrSource.length;
        int left = 0; int right = 0;
        HashMap<String, Integer> mapFrequent = new HashMap<>();
        List<String> result = new ArrayList<>();

        while (right < size) {

            int window = right - left + 1;
            if (window >= k) {
               String key = s.substring(left, right + 1);
               mapFrequent.put(
                       key,
                       mapFrequent.getOrDefault(key, 0) + 1
               );
               if (mapFrequent.get(key) == 2) {
                   result.add(key);
               }

               left++;
            }

            right++;
        }

        return result;
    }

}
