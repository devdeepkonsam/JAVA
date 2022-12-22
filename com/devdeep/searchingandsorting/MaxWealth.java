package com.devdeep.searchingandsorting;
//https://leetcode.com/problems/richest-customer-wealth/submissions/
//1672//

public class MaxWealth {
    public static void main(String[] args) {
        int [][] account = {
           {1,2,3},
           {4,6,8},
           {3,5,7}

        };
        System.out.println(maximumWealth(account));

        
    }
    static int maximumWealth(int[][] wealth){
        int max=0;
        for (int i = 0; i < wealth.length; i++) {
            max = Math.max(max,totalwealth(wealth[i]));
            
        }
        return max;
    }
    static int totalwealth(int[] money){
        int wealth =0;
        for (int i = 0; i < money.length; i++) {
            wealth += money[i];   
        }
        return wealth;
    }
   
    
}

