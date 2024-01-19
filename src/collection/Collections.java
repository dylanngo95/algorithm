package collection;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public void init() {
        arrays();
    }

    protected void arrays() {
        int[] a = new int[20];
        int[] b = new int[] {1, 2, 3};

        for (int c : b) {
            System.out.println(c);
        }

    }

    protected void arrayList() {
        List<Integer> arrs = new ArrayList<>();
        arrs.add(1);
        arrs.get(1);
    }
}
