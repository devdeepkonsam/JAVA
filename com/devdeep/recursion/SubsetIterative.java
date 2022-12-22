package com.devdeep.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetIterative{
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] arr1 = {1,2,2};
        List<List<Integer>> ans = subsetduplicate(arr1);
        List<List<Integer>> ans1 = subset(arr);
        System.out.println(ans);
        System.out.println(ans1);
        
    }
    
    public static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }



    public static List<List<Integer>> subsetduplicate(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int  start =0;
        int end =0;
        for (int i = 0 ; i<arr.length ;i++) {
            start = 0;
            //if my current and previous element is same start = end +1
            if (i>0 && arr[i]==arr[i-1]) {
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    
    
}

