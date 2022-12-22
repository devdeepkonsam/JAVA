package com.devdeep.recursion;

public class RotatedBinarysearch {
    public static void main(String[] args) {
        int [] arr= {5,6,7,8,9,1,2,3,4,};
        System.out.println(Rotated(arr, 2, 0, arr.length-1));
        
    }
    //Rotated binary search
    //----------------------------------------------------//
    public static int Rotated(int [] arr , int target ,int start ,int end){
       if(start>end){
        return -1;
       }
       int mid = start+(end-start)/2;
       if (arr[mid]==target) {
        return mid;
       }
       if (arr[start]<=arr[mid]) {
        if (target>=arr[start] && target <=arr[mid]) {
            return Rotated(arr, target, start, mid-1);
        }else{
            return Rotated(arr, target, mid+1, end);
        }
       }
       if (target>=arr[mid]&&target<=arr[end]) {
        return Rotated(arr, target, mid+1, end);
       }
       return Rotated(arr, target, start, mid-1);
    }
    

}
