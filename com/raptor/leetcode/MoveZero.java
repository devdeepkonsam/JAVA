package com.raptor.leetcode;
//https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] arr ={0,1,0,3,12};
        moveZeroes2(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j]!=0) {
                        int temp = nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                        break;
                    }
                }
            }else{
                nums[i]=nums[i];
            }
        }
    }
    public static void moveZeroes2(int [] nums){
        int n = nums.length;
        int read = 0,write=0;
        while (read<n) {
            if (nums[read]!=0) {
                nums[write]=nums[read];
                write++;
            }
            read++;
        }
        while(write<n){
            nums[write]=0;
            write++;
        }
    }
    
}
