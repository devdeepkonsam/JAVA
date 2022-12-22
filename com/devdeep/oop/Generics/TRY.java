package com.devdeep.oop.Generics;

public class TRY {
    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        for (int i = 1; i <= 14; i++) {
            list.add(2*i);
        }
        System.out.println(list.size());
        System.out.println(list);
    }   
}
