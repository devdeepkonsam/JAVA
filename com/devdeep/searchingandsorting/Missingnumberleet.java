package com.devdeep.searchingandsorting;

import java.util.ArrayList;
import java.util.List;

public class Missingnumberleet {
    public static void main(String[] args) {
        int [] arr1 = {0,1,2,3,4,6};
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(arr1));
        List<Integer> ans =findDisappearedNumbers(arr);
        System.out.println(ans);  
    }
    static void swap(int[]arr , int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    //https://leetcode.com/problems/missing-number/
    public static int missingNumber(int[] nums) {
        int i =0;
        while (i<nums.length) {
            int correctindex = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correctindex]){
                swap(nums, i, correctindex);
            }
            else{
                i++;
            }     
        }
        //search for the interger missing;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index){
                return index;
            }      
        }
        return nums.length;
    }
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while (i<nums.length) {
            int correctindex = nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                swap(nums, i, correctindex);
            }
            else{
                i++;
            }
        }
        //search for the interger missing and add in array ans
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                ans.add(index+1);
            }   
        }
        return ans;  
    }
}
