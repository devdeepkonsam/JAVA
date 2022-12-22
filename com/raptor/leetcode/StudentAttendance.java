package com.raptor.leetcode;

//https://leetcode.com/problems/student-attendance-record-i/description/

public class StudentAttendance {
    public static void main(String[] args) {
        String s ="PPALLL";
        System.out.println(checkRecord(s));
    }
    public static boolean checkRecord(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='A')
                count++;
        return count<2 && s.indexOf("LLL")<0;
    }

    public static boolean checkRecord2(String s) {
        int absent = 0;
        for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i)=='A')absent++;
           if (i<s.length()-2) {
            if (s.charAt(i)=='L'&& s.charAt(i+1)=='L' && s.charAt(i+2)=='L') {
                return false;
            }
           }
        }
        if (absent>=2) {
            return false;
        }
        return true;
    }

}
