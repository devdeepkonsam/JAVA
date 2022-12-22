package com.raptor.leetcode;

//https://leetcode.com/problems/ransom-note/
public class RansomNote383 {
    public static void main(String[] args) {
        String ransomNote ="acbb";
        String magZine = "acbab";
        System.out.println(canConstruct(ransomNote, magZine));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char ransom = ransomNote.charAt(i);
            int matchingindex = magazine.indexOf(ransom);
            if (matchingindex==-1) {
                return false;
            }
            magazine = magazine.substring(0, matchingindex)+magazine.substring(matchingindex+1,magazine.length());
        }
        return true;
    }
}
