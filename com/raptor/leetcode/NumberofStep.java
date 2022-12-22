package com.raptor.leetcode;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberofStep {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        int step =0;
        while (num>0) {
            if (num%2==0) { step++; num /=2;
            }
            else { num--; step++;
            }
        }
        return step;
    }
    
    
}
