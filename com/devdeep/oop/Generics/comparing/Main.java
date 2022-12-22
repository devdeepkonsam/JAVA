package com.devdeep.oop.Generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(10, 90.9f);
        Student rahul = new Student(5, 100.2f);
        Student Arun = new Student(12, 222.2f);
        Student Vishal = new Student(25, 91.2f);

        Student [] list = {kunal,rahul,Arun,Vishal};
        System.out.println(Arrays.toString(list));
        // Arrays.sort(list,new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2){
        //         return -(int)(o1.marks-o2.marks);
        //     };
        // });

        Arrays.sort(list,(o1, o2) -> (int)(o1.marks-o2.marks));


        System.out.println(Arrays.toString(list));
    }
    
}
