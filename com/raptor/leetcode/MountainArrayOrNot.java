package com.raptor.leetcode;
//https://leetcode.com/problems/valid-mountain-array/
public class MountainArrayOrNot {
    public static void main(String[] args) {
        int [] arrr ={0,2};
        System.out.println(validMountainArray(arrr));
        
    }
    public static boolean validMountainArray(int [] arr){
        if (arr==null || arr.length<3) {
            return false;
        }
        int i = 0;
        int j = arr.length - 1;
        //check the highest from 0-last
        //searching from left to right
        while (i + 1 < arr.length && arr[i] < arr[i+1]) {
            i++;
        }
        //check the highest from last -0
        //searching from right to left
        while (j > 0 && arr[j] < arr[j-1]) {
            j--;
        }
        //if both have same index return true
        return (i > 0 && i == j && j < arr.length-1);
    }
}
