package com.devdeep.oop.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(18);
        daughter.career();
        daughter.partner();


        Parent.Hello();
        Son.Hello();
        Daughter.Hello();


        son.normal();
        daughter.normal();


        // Parent mom = new Parent(38);
        //cannot create object of an abstract class directly
        //to create 
        Parent mom = new Parent(38) {
            @Override
            void career(){

            }
            @Override
            void partner(){

            }
        };
        mom.age=38;


    }
}
