package com.raptor.leetcode;
//https://leetcode.com/problems/determine-if-string-halves-are-alike
public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        String s ="textbookrr";
        System.out.println(halvesAreAlike2(s));
    }
    public static boolean halvesAreAlike(String s) {
        int len =s.length();
        int halves = s.length()/2;
        String a = s.substring(0, halves).toLowerCase();
        String b = s.substring(halves,len).toLowerCase();
        int vowela=0,vowelb=0;
        for (int i = 0; i < halves; i++) {
            if (a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
                vowela++;
            }
            if (b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u') {
                vowelb++;
            }
        }
        if (vowela!=vowelb) {
            return false;
        }
        return true;

    }

    public static boolean halvesAreAlike2 (String s){
        int halves = s.length()/2;
        s = s.toLowerCase();
        int vowela=0,vowelb=0;
        for (int i = 0; i < halves; i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                vowela++;
            }
            if (s.charAt(i+halves)=='a' || s.charAt(i+halves)=='e' || s.charAt(i+halves)=='i' || s.charAt(i+halves)=='o' || s.charAt(i+halves)=='u') {
                vowelb++;
            }
        }
        if (vowela!=vowelb)return false;
        return true;
    }
    
    
}
