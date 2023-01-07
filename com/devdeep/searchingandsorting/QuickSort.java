package com.devdeep.searchingandsorting;


import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,0};
        //quicky(arr, 0, arr.length-1);
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    public static void quicksort(int [] arr, int low , int high){
        if (low>= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + ( e- s)/2;
        int pivot = arr[m];
        while (s<=e) {
            //also is a reason why its already sorted it will not swap
            while (arr[s]<pivot) {
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            //swap;
            if (s<=e) {
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        // pivot is at corect index,please sort the two halves divided by pivot;
        quicksort(arr, low, e);
        quicksort(arr, s, high);


    }

    public static void quicky(int [] arr, int low, int high){
        if (low<high) {
            int pidx = partition(arr,low,high);
            quicky(arr, low, pidx-1);
            quicky(arr, pidx+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }


    public static int [] mergesort(int [] arr){
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left , right);
    }
    public static int[] merge(int[] left, int[] right) {
        int [] ans = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;
        while (i<left.length && j<right.length ) {
            if (left[i]<right[j]) {
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            ans[k]= right[j];
            j++;
            k++;
        }
        return ans;
    }

}
