package com.devdeep.recursion;

public class Recursionlinear {
    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4,5,6,7,8,9,0};
        System.out.println(linearsearch(arr, 4));
        System.out.println(linearsearch1(arr,4));
        // System.out.println(linearsearch2ArrayList(arr, 0 , list));
        // System.out.println(linearsearch3ArrayList(arr, 0));

        
        
    }
    //TRUE OR FALSE 
    //---------------------------------------------------------------------//
    public static boolean linearsearch(int[] arr, int target) {
        return helper(arr,target,0);
    }

    public static boolean helper(int[] arr, int target, int index) {
        if (index==arr.length) {
            return false;
        }
        return arr[index]==target || helper(arr, target, index+1);
    }
    //INDEX OF A TARGETED NUMBER
    //---------------------------------------------------------------------//
    public static int linearsearch1(int[] arr, int target) {
        return helper1(arr,target,0);
    }

    public static int helper1(int[] arr, int target, int index) {
        if (index==arr.length) {
            return -1;
        }
        if (arr[index]==target) {
            return index;
        }
        return helper1(arr, target, index+1);
    }
    //DUPLICATES INDEX OF A NUMEBR
    //---------------------------------------------------------------------//
    // static ArrayList<Integer> list = new ArrayList<>();
    // public static ArrayList linearsearch2ArrayList(int [] arr , int target , ArrayList<Integer> list) {
    //     return helper2(arr, target ,0 , list);
        
    // }
    // public static ArrayList helper2(int [] arr,int target , int index, ArrayList<Integer>list) {
    //     if (index==arr.length) {
    //         return list;
    //     }
    //     if (arr[index]==target) {
    //         list.add(index);
    //     }
    //     return helper2(arr, target, index+1, list);
    // }
    // //Return ArrayList without passsing in the argument
    // //---------------------------------------------------------------------//
    // public static ArrayList linearsearch3ArrayList(int [] arr , int target) {
    //     return helper3(arr, target ,0);
        
    // }
    // public static ArrayList helper3(int [] arr,int target , int index) {
    //     ArrayList<Integer> list3 = new ArrayList<>();
    //     if (index==arr.length) {
    //         return list;
    //     }
    //     //this will contatin answer on the function call only
    //     if (arr[index]==target) {
    //         list.add(index);
    //     }
    //     ArrayList <Integer> belowlist =helper3(arr, target, index+1);
    //     list3.addAll(belowlist);

    //     return list3;
    // }
}