package com.raptor.leetcode;
//https://leetcode.com/problems/single-number/

//Using Xor 
/* 0^0=0
 * 0^2=2
 */
public class Singlenumber {
    public static void main(String[] args) {
        int [] arr ={1,2,2,1,3,3,4,5,4};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int ans =0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
