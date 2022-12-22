package com.devdeep.searchingandsorting;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end =arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //decresing part or mid might be the answer
             end = mid;
            }
            else{
                //incresing part or
                start= mid+1;
            }   
        }
        //in the end,start ==end are pointing to larger number
        //hence 
        return start;
    }
}
