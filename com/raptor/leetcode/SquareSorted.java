package com.raptor.leetcode;
//https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class SquareSorted {
    public static void main(String[] args) {
        int [] nums ={-4,0,1,3,9};
        //sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortedSquares2(nums)));
    } 
    //in place  
    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return  nums;
    }
    //create new array
    public static int [] sortedSquares2(int [] nums){
        int n = nums.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
