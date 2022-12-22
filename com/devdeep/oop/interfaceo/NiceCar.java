package com.devdeep.oop.interfaceo;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar(){
        engine = new Power();
    }
    
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        player.start();
    }

    public void stopmusic(){
        player.stop();
    }

    public void UpgardeEngine(){
        this.engine = new ElectricEngine();
    }

}
