package com.devdeep.cloning;

public class Human implements Cloneable{
    String name ;
     int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human other){
        this(other.name, other.age);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
     
}
