package com.devdeep.recursion;

public class November {
    public static void main(String[] args) {
       System.out.println(reverse2(12345));
       System.out.println(palindrome(12321));
       System.out.println(zero(303030322));
    }

    //last bit of binary of any integer is 0 and for odd it is 1
    //(int & 1) gives for eg 10 = 1010 last is 0
    //10&1 mean 1010&1 gives 0 since 0 and 1 gives 0 
    public static boolean isOdd(int n) {
        return (n&1)==1;    
    }
    //it's a xor bitwise operator where a^a gives 0
    //for e.g {1,2,3,4,5,4,3,2,1} 
    //1^2^3^4^5^4^3^2^1 here every integer has its duplicate except 6
    //thus it print 6

    public static int unique(int [] arr){
        int ans =0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }

    //find the kth bit of a number
    //left and right shift is used to shift the 1 binary number
    //(1 << (k - 1)) change the 1 bit is shifted to kth index
    //coz 1&1 gives 1 . 0&1 gives 0

    public static void bitindexk(int n,int k){
        System.out.println((n & (1 << (k - 1))) >> (k - 1));
    }
    public static int magicnumber(int n){
        int ans =0;
        int base =5;
        while (n>0) {
            int last =n&1;
            n = n>>1;
            ans += last*base;
            base = base*5;
            
        }
        return ans;
    }
    //recursion level 1
    //print n....1
    static void func(int n){
        if (n<1) {
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    //print 1.....n
    static void funcrev(int n){
        if(n<1){
            return;
        }
        funcrev(n-1);
        System.out.println(n);
    }
    //factorial using recursion 
    //ef fac(4)=4*fac(4-1)   4*6 = 24
    //eg fac(3)=3*fac(3-1)   3*2 = 6
    //fac(2)=2*fac(2-1)  2*1 = 2
    //fac(1)=return 1
    static int  fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);     
    }
    
    //add up from 1 till n
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    //multiplying every digit of a number
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return n%10*prod(n/10);
    }

    static void func2(int n){
        if (n<1) {
            return;   
        }
        System.out.println(n);
        func2(--n);  
        //func3(n--);  //infinite loop of 5 never decrease
        //n--  vs --n
        //n-- will pass n then substract
        //--n will substract n then pass
    }
    //printing the reverse number
    static void reverse(int n){
       if (n<10) {
          System.out.print(n);
          return;
       }
       System.out.print(n%10);
       reverse(n/10);
    }

///////////////////////////////////////////////
    static int reverse2(int n){
        int digit = (int)(Math.log10(n))+1;
        return ans(n,digit);
    }
    static int ans(int n,int digit){
        if (n%10==n) {
            return n;
        }
        return (int)((n%10)*Math.pow(10, digit-1))+ans(n/10,digit-1);
    }
//////////////////////////////////////////////

   static boolean palindrome(int n){
    return n==reverse2(n);
   }

   static int zero(int n){
    return helper( n , 0);
   }

    static int helper(int n, int i) {
    if (n==0) {
        return i;
    }
    int remainder = n%10;
    if(remainder==0){
       return helper(n/10,i+1);
    }
    else{
       return helper(n/10,i);
    }
}
   
}
