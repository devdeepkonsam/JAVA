package com.devdeep.oop.Generics.lamdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0 ; i< 10 ; i++){
            arr.add(i+1);
        }
        //arr.forEach((item) -> {System.out.println(item*5);});

        Consumer<Integer> fun = (item) -> {System.out.println(item*5);};
        arr.forEach(fun);
        // Operation sum = (a,b) -> a+b;
        // Operation addition = (a,b) -> a+b;
        // Operation result = (a,b) -> a+b;
        
        //LamdaFunction cal = new LamdaFunction();
        //System.out.println(cal.add(5, 3, result));
    }
    // private int add(int a , int b, Operation op){
    //     return op.add(a, b);
    // }
}
interface Operation {
    int add(int a, int b);
}
