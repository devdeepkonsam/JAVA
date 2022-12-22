package com.devdeep.recursion;

import java.util.Arrays;

public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printFibb(10)));

    }

    public static long[] printFibb(int n){
        long [] ans = new long[n];
        if (n==1) {
            ans[0]=1;
            return ans;
        }
        else if(n==2){
            ans[0]=1;
            ans[1]=1;
            return ans;
        }
        ans[0]=1;
        ans[1]=1;
        for (int i = 2; i <n; i++) {
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans;
    }
}
