import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketSort {

    public int[] topKFrequent(int[] nums, int k) {

        // Frequent list
        HashMap<Integer, Integer> frequent = new HashMap<>();
        for(Integer item : nums) {
            frequent.put(item, frequent.getOrDefault(item, 0) + 1);
        }

        // Create a new bucket
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> item : frequent.entrySet()) {
            Integer frequentValue = item.getValue();

            if (buckets[frequentValue] == null) {
                buckets[frequentValue] = new ArrayList<Integer>();
            }
            buckets[frequentValue].add(item.getKey());
        }

        int[] result = new int[k];
        for (int i = buckets.length - 1; i >= 0; i--) {

            if (buckets[i] == null) continue;
            if (k <= 0) break;

            for (int j = 0; j < buckets[i].size(); j++) {
                int index = i - j - 1;
                result[index] = buckets[i].get(j);
                k--;
            }
        }

        return result;
    }
}
