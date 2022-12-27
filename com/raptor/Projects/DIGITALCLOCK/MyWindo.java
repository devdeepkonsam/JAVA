package com.raptor.Projects.DIGITALCLOCK;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class MyWindo extends JFrame
{
    private JLabel heading;
    private JLabel clocklabel;
    private Font font = new Font("",Font.BOLD,35);

    MyWindo(){
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300, 50);
        this.startclock();
        this.createGUI();
       
        super.setVisible(true);
    }

    public void createGUI(){
        heading = new JLabel("MY CLOCK");
        clocklabel = new JLabel();
        heading.setFont(font);
        clocklabel.setFont(font);

        this.setLayout(new GridLayout(2,6));
        this.add(heading);
        this.add(clocklabel);
    }

    public void startclock(){
        Timer timer = new Timer(1000, new Action() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd hh : mm : ss a");//refer to simpledateformat list 
                String datetime = sdf.format(d);
                clocklabel.setText(datetime);
                
            }

            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {
                
            }

            @Override
            public void setEnabled(boolean b) {
                
            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {
            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {
            }
        });
        timer.start();
    }
}
