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
        int last = nums.length-1;
        int start = 0;
        int [] result = new int[last+1];
        int index =last;
        while (start<last) {
            if (Math.abs(nums[last])>Math.abs(nums[start])) {
                result[index]=nums[last]*nums[last];
                last--; index--;
            }
            else{
                result[last]= nums[start]*nums[start];
                index--;
                start++;
            }
        }
        return result;
    }
}
