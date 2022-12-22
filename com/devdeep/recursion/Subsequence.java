package com.devdeep.recursion;


import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String name = "abc";
        System.out.println(subseq(name, ""));
        
    }
    public static void sequence(String up , String p) {
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        sequence(up.substring(1), p+ch);
        sequence(up.substring(1), p);
    }
    //----------------------------------------------------------------///
    static ArrayList<String> subseq (String up , String p){
         if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (p.length()!=0) {
                list.add(p);
            }
            
            return list;
            
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq(up.substring(1), p+ch);
        ArrayList<String> right = subseq(up.substring(1), p);

        left.addAll(right);
        return left;
    }
    //--------------------------------------------------------------//
}
