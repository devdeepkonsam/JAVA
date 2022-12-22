package com.raptor.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/sort-the-people/description/

public class SortnamewithHeight {
    public static void main(String[] args) {
        String [] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int [] height = {17233,32521,14087,42738,46669,65662,43204,8224};
        System.out.println(Arrays.toString(sortPeople(names, height)));
    }




    public static String[] sortPeople(String[] names, int[] heights) {
       for (int i = 0; i < heights.length; i++) {
        int getMaxindex = getMaxindex(heights, i, heights.length-1);
        //swapp
        String temp = names[i];
        names[i]=names[getMaxindex];
        names[getMaxindex]=temp;

        int heighttemp = heights[i];
        heights[i]=heights[getMaxindex];
        heights[getMaxindex]=heighttemp;

       }
        return names;
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
    
}
