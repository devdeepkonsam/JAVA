package com.raptor.leetcode;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInt {
    public static void main(String[] args) {
        String roman = "MXMCIV";
        System.out.println(romanToInt(roman));
    }
    
    public static int romanToInt(String s) {
        Map <Character,Integer> roman_map = new HashMap<>();
        roman_map.put('I', 1);
        roman_map.put('V', 5);
        roman_map.put('X', 10);
        roman_map.put('L', 50);
        roman_map.put('C', 100);
        roman_map.put('D', 500);
        roman_map.put('M', 1000);

        int n = s.length();
        int result = roman_map.get(s.charAt(n-1));
        for (int i = n-2; i >= 0; i--) {
            if (roman_map.get(s.charAt(i))>=roman_map.get(s.charAt(i+1))) {
                result += roman_map.get(s.charAt(i));
            }
            else{
                result -= roman_map.get(s.charAt(i));
            }
        }
        return result;  
    }
}
