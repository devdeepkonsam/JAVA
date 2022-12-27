package com.javaswinglearning;

import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();
        System.out.println(obj.getIgnoreRepaint());
        // obj.setVisible(true);
        // obj.setSize(400,400);
        //we can also write this inside constructor

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class Abc extends JFrame{
    Abc(){
        setLayout(new FlowLayout());// FlowLayout GridLayout Null
        JLabel l = new JLabel("HELLO WORLD");
        JLabel L1 =  new JLabel("WELCOME DEVDEEP");
        add(l);
        add(L1);
        add(L1);
        
        setVisible(true);
        setSize(400,400);
        setTitle("THE BOYS");

    }
}
