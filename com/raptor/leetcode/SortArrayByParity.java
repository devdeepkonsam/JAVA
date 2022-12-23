package com.raptor.leetcode;
//https://leetcode.com/problems/sort-array-by-parity/
import java.util.Arrays;


public class SortArrayByParity {
    public static void main(String[] args) {
        int [] arr = {2,0};
        sortArrayparity(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] sortArrayparity(int [] nums){
        int i =0;
        int j =nums.length-1;
        while (i<j) {
            if ((nums[i]%2!=0) && (nums[j]%2==0)) {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j--;
            }
            else if(nums[i]%2==0){
                i++;
            }
            else if (nums[j]%2!=0) {
                j--;
            }
        }
        return nums;
    }
    
}
