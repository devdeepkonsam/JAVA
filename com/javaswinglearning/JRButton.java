package com.javaswinglearning;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRButton {
    public static void main(String[] args) {
        Radiodemo obj = new Radiodemo();
        System.out.println(obj);
    }
    
}

class Radiodemo extends JFrame{

    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;
    public Radiodemo(){

        t1 = new JTextField(15);
        b = new JButton("OK");
        r1 = new JRadioButton("MALE");
        r2 = new JRadioButton("FEMLAE");
        l = new JLabel("GREETING");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(l);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                String name = t1.getText();
                name = name.toUpperCase();
                if (r1.isSelected()) {
                    name = "HELLO"+"Mr."+name;
                }
                else{
                    name = "HELLO"+"Mrs."+name;
                }
                l.setText(name);
            }
        });

        setVisible(true);
        setLocation(900,300);
        setLayout(new FlowLayout());
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
