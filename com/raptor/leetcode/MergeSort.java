package com.raptor.leetcode;
//https://leetcode.com/problems/merge-sorted-array/
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int m =3,n=3;
        int [] nums1 ={1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));


    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = Arrays.copyOf(nums1, m);
        int index =0;
        int i = 0, j =0;
        while (i<m && j <n) {
            if (arr[i]<nums2[j]) {
                nums1[index]=arr[i];
                i++;
            }else{
                nums1[index]=nums2[j];
                j++;
            }
            index++;
        }
        while (i<m) {
            nums1[index]=arr[i];
            i++;
            index++;
        }
        while (j<n) {
            nums1[index]=nums2[j];
            j++;
            index++;
        }
    }
}