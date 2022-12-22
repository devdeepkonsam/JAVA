package com.raptor.leetcode;

import java.util.HashSet;
// https://leetcode.com/problems/contains-duplicate/
public class ContainDuplicateinArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        return false;
    }
    
}
