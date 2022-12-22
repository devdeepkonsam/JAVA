package com.devdeep.oop.abstractdemo;

public abstract class Parent{
    int age;

    final int value;

    public Parent(int age){
        this.age = age;
        value=12345;
    }
    //abstract classes cannot create abstract static method coz it should be overriden
    //abstract class can contain static method
    static void Hello(){
        System.out.println("Hello World");
    }


    void normal(){
        System.out.println("this is a normal method");
    }

    //if any of the method is abstract then class has to be abstract
    abstract void career ();
    abstract void partner ();
}