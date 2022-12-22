package com.devdeep.recursion;


public class Recursionpattern {
    public static void main(String[] args) {
        
        loop2(4, 0);
    }
    public static void loop(int n){
        if(n==0){
            return;
        }
        for (int i = 0; i<n; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        loop(--n);
    }
    //----------------------------------------//
    public static void loop1(int row , int column) {
        if (row==0) {
            return;
        }
        if (column<row) {
           System.out.print("*");
           loop1(row, column+1);
        }
        else{
            System.out.println();
            loop1(row-1,0);
        }
    }
    //--------------------------------------//
    public static void loop2(int row , int column) {
        if (row==0) {
            return;
        }
        if (column<row) {
           loop2(row, column+1);
           System.out.print("*");
        }
        else{
            loop2(row-1,0);
            System.out.println();
        }
    }
}

