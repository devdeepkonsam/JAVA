package com.devdeep.recursion;

import java.util.Arrays;

public class Reverseastring {
    public static void main(String[] args) {
        char c [] = {'h','e','l','l','o'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }
    public static void reverseString(char[] s) {
        helper(0,s);
    }
    public static void helper(int index , char [] s){
        if (index>s.length/2) {
            return;
        }
        char c = s[index];
        s[index]=s[s.length-1-index];
        s[s.length-1-index]=c;
        helper(index+1, s);
    }
    
}
