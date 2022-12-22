package com.devdeep.exception;

public class Exceptions {
    public static void main(String[] args) {
        int a = 119;
        int b = 000;
        try {
             divide(a, b);
             String name = "KUNA";
             if (!name.equals("KUNAL")) {
                throw new MyException("name is KUNAL");
             }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        }
        //  finally {
        //     System.out.println("this  will execute;");
        //  }

    }
    static int divide(int a , int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return a/b;
    }
}