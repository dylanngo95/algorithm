import collection.UserMap;
import serialization.SerializationTest;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Collections col = new Collections();
//        col.init();

//        HashMapTest hmTest = new HashMapTest();
//        hmTest.run();

//        UserMap user = new UserMap();
//        user.run();

        SerializationTest s = new SerializationTest();
        try {
            s.run();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        int[] nums = new int[] {1,2,3,4,3};
        int k = 3;

        int[] prices = new int[] {3,3,5,0,0,3,1,4};

        String s1 = "zpetg pufmmdf l onwmwpsyr qlke vuijr yrr sndp txvcv x hgkczoo cfuadsza prz e sucs";
        String s2 = "ab_a";

        String sequences = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        String[] tokens = new String[]{"4","13","5","/","+"};

        int target = 10;
        int[] nums1 = new int[] {6,8};
        int[] nums2 = new int[] {3,2};

        //        CarFleet carFleet = new CarFleet();
        //        carFleet.carFleet(target, nums1, nums2);
        var tmp2 = 0;
    }
}