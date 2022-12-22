package com.devdeep.recursion;

import java.util.Arrays;

public class Bubblesortrecursion {
    public static void main(String[] args) {
        int [] arr = {9,8,6,4,3,1,0};
        bubblesort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    //--------------------------------------------------------//
    //WITHOUT FOR LOOP JUST RECURISON;
    public static void bubblesort(int []arr , int len , int index) {
        if (len==0) {
            return;
        }
        if (len>index) {
            if (arr[index]>arr[index+1]) {
                //swap
                int temp = arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
            }
            bubblesort(arr, len, index+1);
        }
        else{
            bubblesort(arr, len-1, 0);
        }
        
    }
    //------------------------------------------------------//
    //USING FOR LOOP IN THE METHOD;
    // public static int[] bubblesort(int [] arr,int len) {
    //     if (len==0) {
    //         return arr;
    //     }
    //     for (int i = 1; i < len; i++) {
    //         if (arr[i-1]>arr[i]) {
    //             swap(arr, i-1, i);
    //         }
    //     }
    //     return bubblesort(arr, len-1);
    // }

    // public static void swap(int [] arr, int a , int b) {
    //     int temp = arr[a];
    //     arr[a]=arr[b];
    //     arr[b]=temp;
    // }
}
