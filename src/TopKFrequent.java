import java.util.*;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int item : nums) {
            maps.put(item, maps.getOrDefault(item, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((x, y) -> {
            return y.getValue() - x.getValue();
        });

        maps.forEach((key, value) -> {
            queue.offer(new AbstractMap.SimpleEntry<>(key, value));
        });

        maps.forEach((key, value) -> {
            System.out.println(" key " + key + " value " + value);
        });

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> queueInTop = queue.poll();
            result[i] = queueInTop.getValue();
        }

        return result;
    }
}
