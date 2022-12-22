package com.raptor.leetcode;
///https://leetcode.com/problems/length-of-last-word/
public class LengthofLastWord {
    public static void main(String[] args) {
        String name ="Devdeeppp sunjgej  dsjhfgsdygf  ";
        System.out.println(lengthOfLastWord(name));
    }
    public static int lengthOfLastWord(String s) {
        int count =0;
        s = s.trim();
        //trim function remove the last space in the string;
        int end = s.length()-1;
        while (end>=0) {
            if (s.charAt(end)==' ') {
                break;
            }count++;end--;
        }
        return count;
    }
    
}
