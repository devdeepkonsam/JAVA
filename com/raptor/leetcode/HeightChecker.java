package com.raptor.leetcode;
//https://leetcode.com/problems/height-checker/description/
import java.util.Arrays;

public class HeightChecker{
    public static void main(String[] args) {
        int [] height = {4,3,5,2,1};
        System.out.println(heightchecker(height));
    }

    private static int heightchecker(int[] height) {
        int count =0;
        int [] temp = height.clone();
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!=height[i]) count++;
        }
        return count;
    }
}