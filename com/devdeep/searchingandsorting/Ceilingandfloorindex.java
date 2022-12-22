package com.devdeep.searchingandsorting;


import java.util.Scanner;

public class Ceilingandfloorindex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {2,3,4,5,6,8,10,11,15,19,20};
        int a = input.nextInt();
        System.out.println("highest"+ceilingnumber(arr, a ));  //smallest  number greater than the target;
        System.out.println("lowest"+floor(arr, a));     //greatest number smaller than the target
        input.close();
    }
    static int ceilingnumber(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
               start = mid+1;
            }
            else if(arr[mid]>target){
               end = mid-1;
            }
            else{
            return mid;
            }
        }
        return start;
    }
    static int floor(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
               start = mid+1;
            }
            else if(arr[mid]>target){
               end = mid-1;
            }
            else{
            return mid;
            }
        }
        return end;
    }
}
        


















        // int start =0;
        // int end=  arr.length-1;
        // while (start<=end) {
        //     int mid = start + (end-start)/2;
        //     if (arr[mid]==target) {
        //         return target;  
        //     }
        //     else if(target<arr[mid]){
        //         start = mid+1;
        //     }
        //     else{
        //         end= mid+1;
        //     }
            
        // }

        // if(arr[last]<target)
        // {
        //     return 0;
        // } 
        // else{
        // return start;
        // } 