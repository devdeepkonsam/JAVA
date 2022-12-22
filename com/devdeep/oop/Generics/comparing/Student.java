package com.devdeep.oop.Generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;
    public Student(int roll , float marks){
        this.rollno = roll;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "["+rollno+","+marks+"]";
    }

    @Override
    public int compareTo(Student o) {
       int diff =(int)(this.marks-o.marks);
       return diff;
    }
}
