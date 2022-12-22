package com.devdeep.searchingandsorting;

import java.util.Arrays;

public class Sorting{
    public static void main(String[] args) {
        int [] arr = {17233,32521,14087,42738,46669,65662,43204,8224};
        arr = mergesorting(arr);
        System.out.println(Arrays.toString(arr)); 
        bubblesorting(arr);   
        System.out.println(Arrays.toString(arr));
    }
    //SWAPPING FUNCTION.
    static void swap(int[]arr , int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    /*ALL THE SORTING METHOD IN THIS PROGRAM */

    //BUBBLESORTING{
    static void bubblesorting(int[] arr) {
        boolean swapped;
        //run the step n-1 times
        for(int i =0;i<arr.length;i++){
            swapped =false;
            //for each step ,max element is passeed at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //now campare the element before and present
                //swap the element if the present is small than previous  {2,1} here 1 is less than 2 so swap
                if(arr[j]<arr[j-1]){
                    //swap
                    swap(arr, j, j-1);     
                    swapped=true; 
                }   
            }
            if(!swapped){
                break;
            }
        }   
    }
    //}
    

    
    //SELECTIONSORT{
        //With MAX.{
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max in the remaining array and swap it with correct index
            int last = arr.length-i-1;
            int maxindex = getMaxindex(arr,0,last);
            swap(arr, maxindex, last);
         }
    }
    static int  getMaxindex(int[] arr , int start, int end){
        int max =start;
        for (int i = start; i <=end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }     
        }
        return max;
    }
      //}
       //With MIN.{
    static void selectionsortII(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int first =i;
            int indexmin=getMinindex(arr,i,arr.length);
            swap(arr, indexmin, first);    
        }
    }
    static int getMinindex(int [] arr,int start ,int end){
        int min=start;
        for(int i =start;i<end;i++){
            if (arr[start]>arr[i]) {
                min=i; 
            }
        }
        return min;
    }
    //}

    //INSERTIONSORT{
    static void insertionSort(int [] arr){
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
    }
    //}
 

    //CYCLESORT
    //{ For the array of natural number
    static void cyclicSort(int [] arr){
        int i =0;
        while(i<arr.length){
            int correctindex = arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                swap(arr, i, correctindex);
            }
            else{
                i++;
            }
        }
    }
    //For the array of whole number
    static void cyclicSortII(int [] arr){
        int i =0;
        while(i<arr.length){
            int correctindex = arr[i];
            if(arr[i]!=arr[correctindex]){
                swap(arr, i, correctindex);
            }
            else{
                i++;
            }
        }
    }
    ///}
    
    //MERGE SORT{
    public static int [] mergesorting(int [] arr){
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesorting(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergesorting(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right) {
        int [] ans = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;
        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                ans[k]=left[i];
                i++;
            }
            else{
               ans[k]=right[j];
               j++;
            }
            k++;
        }
        while (i<left.length) {
            ans[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }

}