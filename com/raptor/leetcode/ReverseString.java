package com.raptor.leetcode;
//https://leetcode.com/problems/reverse-string/description/
import java.util.Arrays;

public class ReverseString {
  public static void main(String[] args) {
    char[] s ={'h','e','l','l','o'};
    char[] c ={'h','e','l','l','o'};
    reverseString2(c);
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(reverseString(s)));
  }


  public static char[] reverseString(char[] s) {
    int len = s.length;
    for (int i = 0; i < len/2; i++){
      char temp =s[i];
      s[i]=s[len-1-i];
      s[len-1-i]=temp;
    }
    
    return s;
  }

  public static void reverseString2(char[] s) {
    int start=0,end=s.length-1;
    while (start<end) {
      //swap
      char c = s[start];
      s[start]=s[end];
      s[end]=c;
      start++;end--;
    }  
  }
}
