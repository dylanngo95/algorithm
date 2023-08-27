import slidewindow.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = new int[] {2,3,1,2,4,3};
        int k = 7;

        int[] prices = new int[] {3,3,5,0,0,3,1,4};

        String s1 = "cbaebacbacd";
        String s2 = "abc";

        String sequences = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        FindAnagrams findAnagrams = new FindAnagrams();
        var tmp = findAnagrams.findAnagrams(s1, s2);
        var tmp2 = 0;
    }
}