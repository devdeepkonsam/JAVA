package com.devdeep.enumEXample;


public class EnumExample {
    enum Week implements A {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        //public , static and final 
        //since its final you can create child enum 

        Week(){
            System.out.println("contructor call for "+this);
        }
        //this is not public or protected , only private or dafault
        //we dont want to create new objecsts
        //this is not the enum concept

        //internally : public static final Week monday = new Week():
        @Override
        public void hello() {
            System.out.println("hello You Are now calling calling an interface fun ovverride");
        }


    }

    public static void main(String[] args) {

        // for(Week day: Week.values()) {
        //     System.out.println(day);
        // }

        Week days = Week.Monday;
        System.out.println(days.ordinal());
        days.hello();
    }

}