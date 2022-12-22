package com.devdeep.searchingandsorting;

public class Orderagnostic {
    
    public static void main(String[] args) {
        int [] arr = {89,67,45,23,12,9,6,3};
        int [] ars = {3,6,9,12,23,45,67,89};
        System.out.println(OrderagnoBS(arr, 67));
        System.out.println(OrderagnoBS(ars, 67));
        
    }

    static int OrderagnoBS(int [] arr,int target){
        int s = 0;
        int e = arr.length-1;
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