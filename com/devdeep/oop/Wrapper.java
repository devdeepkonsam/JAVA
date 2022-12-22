package com.devdeep.oop;

public class Wrapper {
    public static void main(String[] args) {
    //    Auto object;
    //    for (int i = 0; i<10; i++) {
    //     object = new Auto("Random name");
    //    }

    }
}
class Auto{
    String name;
    Auto(String first){
        System.out.println("object created");
        this.name = first;
    }

    @Override
    protected void finalize() throws Throwable {
        
        System.out.println("Object is destroyed");
    }
    
}


