package com.raptor.leetcode;

public class TotalhammingDistance{
    public static void main(String[] args) {
        int [] nums = {4,14,2};
        System.out.println(totalHammingDistance(nums));
    }
    public static int totalHammingDistance(int[] nums) {
        int distance =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int diff = nums[i]^nums[j];
                while (diff>0) {
                    if ((1 & diff)==1) distance++;
                    diff>>=1;
                }
            }
        }
        return distance;
    }

    // public static int getdistance(int num1, int num2) {
    //     int diff = num1^num2;
    //     int dist = 0;    
    //     while(diff > 0){
    //         if((1 & diff) == 1){
    //             dist++;
    //         }    diff>>=1;
    //     }
    //     return dist;
    // }
}