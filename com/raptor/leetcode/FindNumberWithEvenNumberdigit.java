package com.raptor.leetcode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumberWithEvenNumberdigit {
    public static void main(String[] args) {
        int [] arr ={123,1234,5464,56,0};
        System.out.println(findNumbers(arr));
    }
    
    public static int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            int digit =0;
            while (nums[i]>0) {
                nums[i] /= 10;
                digit++;
            }
            if (digit%2==0 && digit!=0) {
                count++;
            }
        }
        return count;
    }
}
