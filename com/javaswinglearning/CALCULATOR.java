package com.javaswinglearning;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CALCULATOR {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj);
    }
}

class Calc extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton sum,sub,mul,div;
    JLabel res;

    public Calc() {

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        sum = new JButton("SUM");
        sub = new JButton("SUB");
        //Using AbstractAction
        mul = new JButton(new AbstractAction("MUlTIPLY"){
            public void actionPerformed(ActionEvent sub){
                long num1 = Long.parseLong(t1.getText());
                long num2 = Integer.parseInt(t2.getText());
                long val = num1 * num2;
                res.setText(val+"");
            }
        });
        div = new JButton("DIVIDE");
        res = new JLabel("RESULT");

        add(t1);
        add(t2);
        add(sum);
        add(sub);
        add(mul);
        add(div);
        add(res);

        sum.addActionListener(this);
        sub.addActionListener(this);
        //Using anonymous class or inner class
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sub){
                long num1 = Long.parseLong(t1.getText());
                long num2 = Integer.parseInt(t2.getText());
                long val = num1 - num2;
                res.setText(val+"");
            }
        });
        //Using lamda function
        div.addActionListener(div -> {
            long num1 = Long.parseLong(t1.getText());
            long num2 = Integer.parseInt(t2.getText());
            long val = num1 / num2;
            res.setText(val+"");
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("CALCULATOR");
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //for Sum ActionListener 
    @Override
    public void actionPerformed(ActionEvent e) {
        long num1 = Long.parseLong(t1.getText());
        long num2 = Integer.parseInt(t2.getText());
        long val=0;
        //If we use more button.addActionListener()
        if (e.getSource()==sum) { //getSource give object button which intiated the addActionlistener
            val = num1 + num2;
        }else if(e.getSource()==sub){
            val = num1 - num2;
        }
        res.setText(val+"");
        
    }
    

}
