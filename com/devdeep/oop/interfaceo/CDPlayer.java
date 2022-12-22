package com.devdeep.oop.interfaceo;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Start Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music");
    }
    
}
