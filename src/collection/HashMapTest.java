package collection;

import java.util.*;

public class HashMapTest {

    protected Map<String, Integer> map = new HashMap<>();

    private Set<String> set = new HashSet<>();

    private Vector<Integer> vec = new Vector<>();

    public void run() {
        map.put("Dylan", 1);
        map.put("Jackie", 10);

        for (Map.Entry<String, Integer> a : map.entrySet()) {
            System.out.println(a.getKey());
            System.out.println(a.getValue());
        }

        set.add("A");
        set.add("B");
        set.add("B");

        vec.add(1);
        vec.add(2);
    }
}
