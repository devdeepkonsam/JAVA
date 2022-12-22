package com.raptor.leetcode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumberWithEvenNumberdigit {
    public static void main(String[] args) {
        int [] arr ={123,1234,5464,56,0};
        System.out.println(findNumbers2(arr));
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
    public static int findNumbers2(int [] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000)||(nums[i]>99999 && nums[i]<100000)) {
                count++;
            }
        }
        return count;
    }
}
