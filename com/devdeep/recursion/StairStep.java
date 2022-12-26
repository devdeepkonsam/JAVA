package com.devdeep.recursion;

public class StairStep {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        if (n<2) {
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    
}
