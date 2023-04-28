package com.raptor.leetcode;

import java.util.Scanner;
public class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(detectCapitalUse(word));
        sc.close();
    }
    public static boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i=0; i <word.length() ; i++) {
            char c = word.charAt(i);
            if (c>='A' && c<='Z') {
                count++;
            }
            if (!(count==0  || ( count ==1 && word.charAt(0)>='A' && word.charAt(0)>='Z' )|| count==i+1)) {
               return false;
            }
        }
        return true;
    }
    
}
