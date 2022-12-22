package com.devdeep.recursion;



public class Recursionstream {
    public static void main(String[] args) {
        String up = "Apple apples trees take 4-5 app apple ap years apptitude  to produce their first fruit.";
        String p ="";
        skip(p, up);
        System.out.println(skipII(up));
        System.out.println(skipApple(up));
        System.out.println(skipappnotApple(up));
    }
    //no return 
    public static void skip(String p, String up){
        if (up.isEmpty()) {
           System.out.println(p);
           return;
        }
        char ch = up.charAt(0);
        if (ch=='a' || ch =='A') {
            skip(p, up.substring(1));
        }else{
           skip(p+ch, up.substring(1));
        }
    }
    // return string
    public static String skipII(String up){
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch=='A' || ch =='a') {
            return skipII(up.substring(1));
        }
        else{
            return ch +skipII(up.substring(1));
        }
    }
    //Skip a string
    public static String skipApple(String apple) {
        if (apple.isEmpty()) {
            return "";
        }

        if (apple.startsWith("apple") || apple.startsWith("Apple")) {
            return skipApple(apple.substring(5));
        }
        return  apple.charAt(0) + skipApple(apple.substring(1));
    }

    //skip app from any word x=except apple
    public static String skipappnotApple(String apple) {
        if (apple.isEmpty()) {
            return "";
        }

        if (apple.startsWith("app") &&  !apple.startsWith("apple")) {
            return skipappnotApple(apple.substring(3));
        }
        return  apple.charAt(0) + skipappnotApple(apple.substring(1));
    }
}
