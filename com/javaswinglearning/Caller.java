package com.javaswinglearning;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;


public class Caller {
    public static void main(String[] args) {
        X obj = new X();
        System.out.println(obj);
    }
    
}
class X extends JFrame{
    public X(){

        JButton b = new JButton("CALCULATOR"); 
        add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //after calling the calc class the X class should exit
                new Calc();
                dispose();
            }
        });

        setVisible(true);
        setLayout(new FlowLayout());
        setLocation(700, 350);
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
