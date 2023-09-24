import slidewindow.*;
import stack.EvalRPN;
import twopoiter.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = new int[] {0,0,0,0};
        int k = 3;

        int[] prices = new int[] {3,3,5,0,0,3,1,4};

        String s1 = "zpetg pufmmdf l onwmwpsyr qlke vuijr yrr sndp txvcv x hgkczoo cfuadsza prz e sucs";
        String s2 = "ab_a";

        String sequences = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        String[] tokens = new String[]{"4","13","5","/","+"};

        EvalRPN evalRPN = new EvalRPN();
        var tmp = evalRPN.evalRPN(tokens);
        var tmp2 = 0;
    }
}