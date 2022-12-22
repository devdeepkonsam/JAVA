package com.raptor.leetcode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]!=nums[i]) {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
    
}
