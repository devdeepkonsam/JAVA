package com.devdeep.recursion;

import java.util.ArrayList;

public class PermutationRecursion {
    public static void main(String[] args) {
        System.out.println(permutationlist("", "abc"));
    }
    static void permutation(String p,String up){
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f =p.substring(0,i);
            String s =p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }

    }
    //return Arraylist
    
    public static ArrayList<String> permutationlist(String p,String up){
        if (up.isEmpty()) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationlist(f + ch +s, up.substring(1)));
        }
        return ans;
    }
}
