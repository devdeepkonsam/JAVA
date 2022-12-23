package com.raptor.leetcode;
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int [] arr ={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
public static int [] replaceElements(int [] arr) {
    int max;
    for (int i = 0; i < arr.length ; i++) {
        max =-1;
        for (int j = i+1; j < arr.length; j++) {
            // if (arr[j]>max) {
            //     max=arr[j];
            // }
            max = Math.max(max,arr[j]);
        }
        arr[i]=max;
        
    }
    return arr;
}
    
}
