package com.devdeep.oop;

public class Polymorphism {
    public static void main(String[] args) {
        Number num = new Number();
        System.out.println(num.sum(12,20,32));
        Shapes square = new Square();
        square.area();

        Shapes.greeting();
        Square.greeting();
    }
}
//overloading 
class Number {
    int sum(int a , int b){
        return a + b;
    }

    int sum(int a , int b , int c){
        return a + b + c;
    }
}
//overriding
class Shapes{
    void area (){
        System.out.println("area");
    }
    static void greeting(){
        System.out.println("hello i m in the shapes");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("area of square is side square");
    }
    static void greeting(){
        System.out.println("hwllo i am in the square");
    }
}
class circle extends Shapes{
    //this will run when obj of cicrcle is created 
    //hence it is overrididng the parent method
    //@Override // this is called annotation
    void area(){
        System.out.println("area of circle is pi * side square");
    }
}