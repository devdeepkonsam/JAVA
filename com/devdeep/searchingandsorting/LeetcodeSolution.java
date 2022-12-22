package com.devdeep.searchingandsorting;

//https://leetcode.com/problems/find-in-mountain-array/

public class LeetcodeSolution {
    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,3,2,1,0};
        int target = 0;
        System.out.println(search(arr, target));
        
    }
  
    static int search (int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        //search in first half
        int first = OrderagnoBS(arr, target, 0, peak);
        if(first!=-1){
            return first;
        }
        //search in second half
        return OrderagnoBS(arr, target, peak, arr.length-1);

    }
    //to find the peak and distribute two arrays in increasing and dercreasing order
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
    //searching for the target in each half arr after the peak is found
    static int OrderagnoBS(int [] arr,int target,int s,int e){
        //find whether the array sorted in acscending or descending
        boolean isArc = arr[s] <arr[e];
        while(s<=e){
            int mid = s + (e -s)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if(isArc){                  //asceding sorted list
                if(arr[mid]<target){
                  s = mid+1;
                }
                else if(arr[mid]>target){
                   e= mid-1;
                }
            }
            else{                     //desccending sortd list
                if(arr[mid]<target){
                    e = mid-1;
                }
                else if(arr[mid]>target){
                    s = mid+1;
                }
            }
        }
        return -1;
    }
    
}
