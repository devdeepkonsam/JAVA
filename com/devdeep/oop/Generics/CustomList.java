package com.devdeep.oop.Generics;

import java.util.Arrays;

public class CustomList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE =1;
    private int size =0; //also working as index 

    public CustomList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (this.isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object [] temp = new Object[data.length+1];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    // public T get(int index){
    //     return (T) data[index];
    // }

    public void remove(){
        data[--size]=0;
        reduce();
    }

    private void reduce() {
        Object [] temp = new Object[data.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public int size(){
        return size;
    }

    public void set(int index,T num){
        data[index]=num;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }    


    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();
        list.add(12);
        list.add(23);
        list.add(56);
        System.out.println(list);

        CustomList<String> list2 = new CustomList<>();
        list2.add("Chang");
        list2.add("Vishal");
        list2.add("Arun");
        System.out.println(list2);
    }
}