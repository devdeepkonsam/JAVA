package com.devdeep.oop;

public class SingletonClass {
   private SingletonClass(){

   }

   private static SingletonClass instance;
   
   public static SingletonClass getinstance(){
         //check whether an obj is created or not
         if (instance==null) {
            instance = new SingletonClass();
         }
         return instance;
   }
}