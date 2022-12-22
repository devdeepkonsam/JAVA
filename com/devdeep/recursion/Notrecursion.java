package com.devdeep.recursion;


import java.util.ArrayList;
import java.util.Arrays;

public class Notrecursion {
    public static void main(String[] args) {
        String a = new String("DEVDEEP");
        String b = new String("DEVDEEO");
        // comapring the values
        System.out.println(a.equals(b)); //true
        //check whether the reference variable is pointing to same object or not;
        System.out.println(a==b); //false
        //Since String is a array of character we can see each char in the string using its index
        System.out.println(a.charAt(4));//E


        //formatted printing or pretty printing 
        float c = 432.1234f;
        System.out.printf("formatted number %.2f    \n",c);//432.23
        //for string
        System.out.printf("My Name is %s and my age is %s","DEVDEEP SINGHA","18.");
        ///PLACEHOLDER 
        //%c - Character
        // %d - Decimal number (base 10)
        // %e - Exponential floating-point number
        // %f - Floating-point number
        // %i - Integer (base 10)
        // %o - Octal number (base 8)
        // %s - String
        // %u - Unsigned decimal (integer) number
        // %x - Hexadecimal number (base 16)
        // %t - Date/time
        // %n - Newline


        //OPERATORS
        System.out.println('a'+'b');//195   since its char a = 97,b =98
        System.out.println("a"+"b");//ab    since its a string
        //System.out.println("a"-"b");//substract does not work in string operator overloading
        System.out.println('a'+3);//char a = 97+3 =100
        System.out.println((char)('a'+3));//d since 97+3=100 char(100) is d
        System.out.println("a"+1);//a1 //int 1 with convert to INTERGER that call toString();
        System.out.println("devdeep"+new ArrayList<>());
        //System.out.println("devdeep"+new Integer(18));
        //System.out.println(new Integer(18)+"  "+new ArrayList<>());// + only in primitive and with complex if it contains atleast one string type

        // String performance
 
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series = series+ch; //series += ch 
            //a ,a+b,ab+c,abc+d.....so on //memory wastage
        }
        System.out.println(series);
        //memory does not waste coz it only append in same object;
        //Stringbuilder
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);  
        }
        System.out.println(builder);
        //method
        //https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html



        //String method
        String name = "DEVDEEP SINGHA";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf("E"));
        System.out.println(Arrays.toString(name.split(" ")));
        //https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
        
        System.out.println(November.isOdd(5));

    }
  
}
