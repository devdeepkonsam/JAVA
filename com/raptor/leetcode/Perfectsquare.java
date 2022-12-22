package com.raptor.leetcode;

//https://leetcode.com/problems/valid-perfect-square/description/
public class Perfectsquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
    }

    public static  boolean isPerfectSquare(int num) {
        if(num==1){return true;}
        int s =0;
        int e=num;
        while(s<=e){
            int m = s+(e-s)/2;
            long sqrt = (long)m*m;
            if(sqrt==num){return true;}
            else if(sqrt>num){e=m-1;}
            else{s=m+1;}
        }
        return false;
    }
    
}
