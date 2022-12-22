package com.raptor.leetcode;
//https://leetcode.com/problems/running-sum-of-1d-array
import java.util.Arrays;

public class RunningSumof1D {
    public static void main(String[] args) {
        int [] arr = {1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i-1]+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    
}
