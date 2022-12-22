package com.raptor.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/keyboard-row/
public class KeyBoardRow {
    public static void main(String[] args) {
      String [] words ={"adsdf","sfd","qdf"};
      System.out.println(Arrays.toString(findWords(words)));
    }
    public static String [] findWords(String[] words){
        HashMap<Character,Integer> rowID = new HashMap<>();
        String [] alphabet = {"QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i].length(); j++) {
                rowID.put(alphabet[i].charAt(j), i+1);
            }
        }
        ArrayList<String>  ans = new ArrayList<>();
        for (String word : words) {
            boolean same_row =true;
            if(word.length()==1) ans.add(word);
            else{
                for (int i = 1; i < word.length(); i++) {
                    if (rowID.get(word.charAt(i))!=rowID.get(word.charAt(0))) {
                       same_row = false;
                       break;
                    }
                }
                if (same_row) ans.add(word);
            }
            
        }
        return ans.toArray(new String[0]);

    }
    
}
