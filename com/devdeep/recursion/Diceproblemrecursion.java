package com.devdeep.recursion;

import java.util.ArrayList;

public class Diceproblemrecursion {
    public static void main(String[] args) {
        System.out.println(diceroll("", 4));
        //for dice with custom faces 
        //System.out.println(dicerollcustom("",4,9));

    }
    public static ArrayList<String> diceroll(String p,int target){
        if (target==0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> listnew = new ArrayList<>();
        for (int i = 1; i <= 2 && i<= target; i++) {
           listnew.addAll(diceroll(p+i, target-i));
        }
        return listnew;
    }
    

    // if you want a custom faces of dice
    public static ArrayList<String> dicerollcustom(String p,int target,int faces){
        if (target==0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> listnew = new ArrayList<>();
        for (int i = 1; i <= faces && i<= target; i++) {
           listnew.addAll(dicerollcustom(p+i, target-i,faces));
        }
        return listnew;
    }
}
