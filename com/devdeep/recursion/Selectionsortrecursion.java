package com.devdeep.recursion;


import java.util.Arrays;

public class Selectionsortrecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,8,9,5,8,6,10,122,0,4,41};
        selectionsort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
        int [] arr1 = {1,2,3,8,9,5,8,6,10,122,0,4,41};
        helper(arr1);
        System.out.println(Arrays.toString(arr1));
        
    }
    public static void selectionsort(int []arr , int last){
        if (last==0) {
            return;
        }
        //Find the max index;
        int max = 0;
        for (int i = 0; i <=last; i++) {
            if (arr[i]>arr[max]) {
                max=i;
            }
        }
        //swap max with last;
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
        //call the function again while decresing its length/last
        selectionsort(arr, last-1);
        
    }
    static void helper(int [] arr){
        selectionsortII(arr, arr.length-1, 0, 0);
    }

    //-------------------------------------------------------------------//
    public static void selectionsortII(int [] arr, int last , int index , int max){
        if (last==0) {
            return;
        }
        if (last>index) {
            if (arr[index]>arr[max]) { //max index 
                selectionsortII(arr, last, index+1, index);
            }
            else{
                selectionsortII(arr, last, index+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
            selectionsortII(arr, last-1, 0,0);
        }
    }

    
}
