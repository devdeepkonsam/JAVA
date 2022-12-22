package com.devdeep.oop.interfaceo;

public class Power implements Engine {

    @Override
    public void start() {
        System.out.println("Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Engine Stop");
    }

    @Override
    public void accelearte() {
        System.out.println("Sutututututu");
    }
    
}
