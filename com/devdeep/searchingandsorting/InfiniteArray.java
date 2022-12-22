package com.devdeep.searchingandsorting;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,32,4,5,65,6,545,2,32,6,12,120,123,123,456,21,189,123,150,200,245,34,456,5657,7575,3453,454,567,766,876,98,789,675,456,5443,3454,132,324,543,6576,7,87,8,98,988,67,766,456,5,543,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 7575;
        System.out.println( index(arr, target)); 
    }
    static int index(int [] arr, int target){
        int start =0;
        int end =1;
        while(target>arr[end]){     //searching for ending index where the target is lower than end
            int temp = end+1;       //take temp as start temporary
            end = end+(end-start)*2;
            start = temp;    
        }
        int res = binarysearch(arr, target, start, end);
        return res;
    }


   //here we dont know the size of  array during the function is called we will insert it in its specific parameter

    static int binarysearch(int [] arr, int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2; //find the mid element; // int mid = (start+end)/2; //might be possible that (start + end ) greater than integer range               
            if(arr[mid]<target){    //since the target is large then we will move to right side
                start = mid+1;      //meaning start changes
            }
            else if(arr[mid]>target){   //since the target is less then we will move to left side
                end = mid-1;            //meaning changing end 
            }
            else{
                return mid;           //if the target is equal then return the index
            }
        }
        return -1;
    }
    
    
}
