package com.devdeep.oop;


public class Staticblock {
    static int a = 4;
    static int b;
    static{
        System.out.println("I am in static block");
        b = a*10;
    }
    public static void main(String[] args) {
       // Staticblock obj = new Staticblock();
        System.out.println(Staticblock.a +" "+Staticblock.b);
        Staticblock.a = 10;
        System.out.println(Staticblock.a +" "+Staticblock.b);
    }
    
}
 