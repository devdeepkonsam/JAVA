package com.javaswinglearning;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;


public class ADDGUI {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj);
    }
    
}
class Addition extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton s;
    JLabel l;

    public Addition()
    {
        //setLocation(300, 300);
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        s = new JButton("SUM");
        
        

        l = new JLabel("RESULT");
        add(t1);
        add(t2);
        add(s);
        add(l);

        s.addActionListener(this); // ActionListner is an interface

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //for line 54 calling the function of addActionListener
    public void actionPerformed(ActionEvent e){
        Long num1 = Long.parseLong(t1.getText());
        long num2 = Integer.parseInt(t2.getText());

        long val = num1 + num2;
        l.setText(val+"");
    }
}



