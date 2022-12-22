package com.devdeep.oop.interfaceo;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("ElectricEngine Start");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine Stop");
    }

    @Override
    public void accelearte() {
        System.out.println("ElectricEngine Accelerate");
    }
    
}
