package com.devdeep.oop.Generics;

import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private static int DEFAULT_SIZE =1;
    private int size =0; //also working as index 

    public CustomArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }


    public void add(int num){
        if (this.isfull()) {
            resize();
        }
        data[size++] = num;
    }


    private void resize() {
        int [] temp = new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data = temp;
    }


    private boolean isfull() {
        return size == data.length;
    }


    public int get(int index){
        return data[index];
    }


    public void remove(){
        data[--size]=0;
        reduce();
    }


    private void reduce() {
        int [] temp = new int[data.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }


    public int size(){
        return size;
    }

    public void set(int index,int num){
        data[index]=num;
    }

    
    @Override
    public String toString(){
        return Arrays.toString(data);
    }
    
    
}