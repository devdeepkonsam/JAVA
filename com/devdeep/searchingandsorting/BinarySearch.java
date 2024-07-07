package com.devdeep.searchingandsorting;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int num = input.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]  = input.nextInt();
        }
        int target = 12;
        //System.out.println(binarysearch(arr, target)!=-1);   //boolean true / false
        System.out.println(binarysearch(arr, target));       //index
        input.close();

    }
    //return index
    //return -1 if not found
    static int binarysearch(int [] arr, int target){
       int start = 0;
       int end = arr.length-1;
        while(start<=end){
            //find the mid element;
            // int mid = (start+end)/2;    //might be possible that (start + end ) greater than integer range
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
        return -1;
    }
}
