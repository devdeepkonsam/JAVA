package com.devdeep.searchingandsorting;

public class Perfectsquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(PerfectSquare(16));
        
    }
    public static boolean isPerfectSquare(int num){
        int lo =1;
        int hi =num;
        int mid=0;
        while(lo<hi){
            mid = lo + (hi-lo)/2;
            if(mid*mid==num){
                return true;
            }
            else if (mid*mid>num){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return false;
    }

    public static int PerfectSquare(int num){
        int lo =1;
        int hi =num;
        int mid=0;
        while(lo<hi){
            mid = lo + (hi-lo)/2;
            if(mid*mid==num){
                return mid;
            }
            else if (mid*mid>num){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;
    }
    
}
