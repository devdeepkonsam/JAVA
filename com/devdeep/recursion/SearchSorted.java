package com.devdeep.recursion;

public class SearchSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,8,9,0};
        System.out.println(sorted(arr,0));
        System.out.println(search(arr,9,0));
    }
    //check whether the array is sorted or not
    static boolean sorted(int[] arr, int index) {
        //base condition to stop when index is at last index
        if (index==arr.length-1) {
            return true;
        }
        return arr[index]<arr[index+1]&&sorted(arr, index+1);
    }
    //find the index the target in the array
    static boolean search(int [] arr , int target,int index){
        if (index==arr.length-1) {
            return false;
        }
        return arr[index]==target || search(arr, target, index+1);
    }
    
}

