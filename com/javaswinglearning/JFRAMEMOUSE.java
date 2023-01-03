package com.javaswinglearning;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;

public class JFRAMEMOUSE {
    public static void main(String[] args) {
        XYZ obj = new XYZ();
        System.out.println(obj);
    }
}

class XYZ  extends JFrame{
    public XYZ(){
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent m){
                int x = m.getX();
                int y = m.getY();
                System.out.println(x+" "+y);
            }
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
