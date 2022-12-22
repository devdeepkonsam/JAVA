package com.raptor.leetcode;
//https://leetcode.com/problems/longest-common-prefix/description/
public class longestCommonPrefix14{
    public static void main(String[] args) {
        String [] strs ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length==0){return "";}
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j <prefix.length(); j++) {
                if (j==strs[i].length() || prefix.charAt(j)!=strs[i].charAt(j)) {
                    prefix = strs[i].substring(0,j);
                    break;
                }
            }
        }
        return prefix;
    }
}
