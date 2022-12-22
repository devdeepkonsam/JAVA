package com.devdeep.searchingandsorting;

import java.util.Arrays;

//it tells th the first ans last index of the duplicate element;
public class SearchRange {
    public static void main(String[] args) {
       int[] arr = {1,3,4,7,7,7,8,9,12,16}; 
       int target = 7;  
       System.out.println(Arrays.toString(searchRange(arr, target))); 
    }
    
    public static int[] searchRange(int[] nums, int target) {
        int [] arr = new int[2];
        arr[0] =index(nums, target, true);
        arr[1] =index(nums, target, false);
        return arr;
        
    }
    public static int index (int[] nums, int target,boolean firstindex) {
        int right = 0;
        int left = nums.length-1;
        int res =-1;
        while(right<=left){
            int mid = right+(left-right)/2;
            if(nums[mid]==target){
                res =mid;       //temporary taking mid as first for true and last for false
                if(firstindex){
                    left = mid-1;
                }
                else{
                    right = mid+1;
                }
            }
            if(nums[mid]>target){
                left = mid-1;
            }
            else{
                right = mid+1;
            }
        }
        return res;   //permanent result;
    }  
}
