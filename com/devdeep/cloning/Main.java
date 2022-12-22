package com.devdeep.cloning;


public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human a = new Human("Devdeep",18);
        //Human b = new Human(a);

        //Clonable
        Human b = (Human)a.clone();
        System.out.println(b.age);

    }
    
}