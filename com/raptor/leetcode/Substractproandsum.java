package com.raptor.leetcode;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/862080773/
public class Substractproandsum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    private static int subtractProductAndSum(int n) {
        int product=1,sum=0;
        while (n>0){
            product = product*(n%10);
            sum = sum + n%10;n /= 10;}
        return product-sum;
    }
}
