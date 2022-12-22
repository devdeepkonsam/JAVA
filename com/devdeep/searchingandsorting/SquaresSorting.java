package com.devdeep.searchingandsorting;

import java.util.Arrays;

public class SquaresSorting {
    public static void main(String[] args) {
        int[]arr = {-4,-1,0,3,10};
        sortedSquares(arr);
        System.out.println(Arrays.toString(arr)); 

        
    }
    //https://leetcode.com/problems/squares-of-a-sorted-array/
    public static int [] sortedSquares(int [] arr) {
        for(int i =0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        return insertionSort(arr);  
    }
    static int [] insertionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);   
                }
                else{
                    break;
                }   
            }    
        }
        return arr;
    }
    static void swap(int[]arr , int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}