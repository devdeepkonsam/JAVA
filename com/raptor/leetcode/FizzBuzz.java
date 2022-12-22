package com.raptor.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divisibleby3 = i%3==0;
            boolean divisibleby5 = i%5==0;
            if (divisibleby3 && divisibleby5) ans.add("FizzBuzz");
            else if(divisibleby3) ans.add("Fizz");
            else if(divisibleby5) ans.add("Buzz");
            else ans.add(""+i);
        }
        return ans;
    }
    
}
