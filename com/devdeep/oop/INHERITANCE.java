package com.devdeep.oop;


public class INHERITANCE {
    public static void main(String[] args) {
        
    }
}

class A {     //parent class
    String name;
    String address;
    A(String name , String address){
        this.name = name;
        this.address = address;
    }
}

class B extends A{    //child class 
    int age;
    int height;
    B(String name, String address , int age , int height){
        super(name, address);      //calling the parent class
        this.age = age;
        this.height = height;
    }
}

class C extends B{  //multilevel
    String school;
     C(String name , String address , int age , int height ,String school){
       super(name, address, age, height);
       this.school = school;
    }
}