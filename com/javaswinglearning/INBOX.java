package com.javaswinglearning;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class INBOX {
    public static void main(String[] args) {
        Radiodemo obj = new Radiodemo();
        System.out.println(obj);
    }
    
}

class Radiodemo extends JFrame{

    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JCheckBox c1,c2;
    JLabel l;
    public Radiodemo(){

        t1 = new JTextField(15);
        b = new JButton("OK");
        r1 = new JRadioButton("MALE");
        r2 = new JRadioButton("FEMLAE");
        l = new JLabel("GREETING");
        c1 = new JCheckBox("DANCING");
        c2 = new JCheckBox("SINGING");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);

        //for checkbox ItemListener
        c1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                System.out.println("DANCING");//Everytime i click c1 it print DANCING
            }
        });

        
        //for button ActionListener
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                String name = t1.getText();
                name = name.toUpperCase();
                if (r1.isSelected()) {
                    name = "Mr."+name;
                }
                else{
                    name = "Mrs."+name;
                }
                name = name + " like";
                if (c1.isSelected()) {
                    name = name + " DANCING";
                }
                if (c2.isSelected()) {
                    name = name + " SINGING";
                }
                l.setText(name);

            }
        });
        
        

        setTitle("INBOX");
        setVisible(true);
        setLocation(900,300);
        setLayout(new FlowLayout());
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
