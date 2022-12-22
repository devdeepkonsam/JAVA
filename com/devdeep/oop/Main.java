package com.devdeep.oop;


public class Main {
    public static void main(String[] args) {
        //store 5 roll nos 
        int [] rollnumbers = {1,2,3,4,5};
        //store names
        String [] names = {"aman","arun","bharghav","charlie","derick"};

        //store data of all the student 
        //{rno,name,marks}
        int [] rno = new int [5];
        String [] name = new String [5];
        int [] marks = new int [5];


        System.out.println(rollnumbers+""+names);
        System.out.println(rno);
        System.out.println(name);
        System.out.println(marks);
        //here the classes and objects where
        //we can create a new data type call Student that store all the respective rno,name,marks
        
        //without contructor
        // Student student1 = new Student();
        // student1.rno =1;
        // student1.name ="DEVDEEP";
        // student1.marks=87;

        Student student1 = new Student(1,"kunal",90);
        student1.print();
        student1.newname("arun");
        student1.print();

        Student student2 = new Student(2, "Devdeep", 91);
        student2.print();

        Student student3 = student2;
        student3.print();
        student2.newname("Devdeepsingha");
        student3.print();
        student2.print();


    }
}
//create a class
//for every single student
class Student {
    int rno;
    String name;
    float marks;
    //constructor
    Student(int first,String second,float third){
        this.rno = first;
        this.name = second;
        this.marks = third;
    }
    //to make daefault if we dont pass argument inside the constructor;
    Student(){
        this (0,"default",100.0f);
    }
    //method
    void print(){
        System.out.println(rno+" "+name+" "+marks);
    }
    //method to print the details
    void printwiththis(){
        System.out.println(this.rno+" "+this.name+" "+this.marks);
    }
    //change the name 
    void newname(String newname){
         name = newname;
    }
    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}

