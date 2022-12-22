package com.raptor.leetcode;
///https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
    public static int hammingDistance(int x, int y) {
        int diff = x^y;
        int dist=0;
        while (diff>0) {
            if ((1 & diff)==1) dist++;
               diff>>=1;
        }
        return dist;
    }
}
