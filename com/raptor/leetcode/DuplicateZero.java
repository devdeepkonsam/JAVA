package com.raptor.leetcode;
//https://leetcode.com/problems/duplicate-zeros/
import java.util.Arrays;

public class DuplicateZero {
    public static void main(String[] args) {
        int [] arr ={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            if (arr[i]==0) {
                for (int j = len-1; j > i+1; j--) {
                    arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i++;
            }
        }
    }
}
