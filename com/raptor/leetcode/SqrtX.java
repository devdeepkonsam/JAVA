package com.raptor.leetcode;

//https://leetcode.com/problems/sqrtx/description/

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    
    public static int mySqrt(int x) {
        if (x < 2) return x;
        int end = x / 2;
        int start = 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((long)mid*mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
