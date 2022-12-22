package com.devdeep.recursion;

import java.util.ArrayList;

public class Phonedigittoletter {
    public static void main(String[] args) {
        System.out.println(letttercombination("","19"));
        System.out.println(letttercombinationcount("", ""));
    }
    public static ArrayList<String> letttercombination(String p, String up){
        ArrayList<String> listnew = new ArrayList<>();
       if (up.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
       }
       int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch =(char)('a'+i);
            listnew.addAll(letttercombination(p+ch, up.substring(1)));
        }
       return listnew;
    }

    public static int letttercombinationcount(String p, String up){
        if (up.isEmpty()) {
            return 1;
        }
        int count =0;
        int digit = up.charAt(0)+'0';
        for (int i = (digit-1)*3; i < (digit*3); i++) {
            char ch = (char)('a'+i);
            count = count+letttercombinationcount(p+ch, up.substring(1));
        }
        return count;
    }
}
/*1 abc 
 2 def
 3 ghi
 4 jkl
 5 mn0
 6 pqr
 7 stu
 8 vwx
 9 yz{
 */
