package com.raptor.leetcode;

public class RemoveElements {
    public static void main(String[] args) {
        int [] nums ={0,1,2,2,3,4,5,6};
        System.out.println(removeElements(nums, 2));
    }
    public static int removeElements(int [] nums,int val){
        int index =0;
        for (int i : nums) {
            if (i!=val) {
                nums[index]=i;
                index++;
            }
        }
        return index;
    }
    
}
