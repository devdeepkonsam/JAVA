package com.devdeep.recursion;

import java.util.ArrayList;
import java.util.Arrays;

// maze with obstatcles;
public class Mazewithobstacle{
    public static void main(String[] args) {
        boolean [][] arr = {{true,true,true},
                            {true,false,true},
                            {true,true,true}
                            }
                           ;
        int [][] path = new int [arr.length][arr[0].length];
        allpathwaysPRINT("", arr, 0, 0, path, 1);
   //     allpathways("", arr, 0, 0);
   //     pathrestriction("", arr, 0, 0);
   //     System.out.println(pathrestrictionlist("", arr, 0, 0));
    }

    //Print the UP,DOWN,RIGHT,LEFT i.e DIRECTION
    ///////////////////////////////////////////////////////////////////////////
    public static void allpathways(String p , boolean [][] maze , int row, int column){
         if (row==maze.length-1 && column==maze[0].length-1) {
            System.out.print(p+" ");
            return;
        }
        if (!maze[row][column]) {
            return;
        }
        maze[row][column]=false;
        if (row<maze.length-1) {
            allpathways(p+"D", maze, row+1, column);
        }
        if (column<maze[0].length-1) {
            allpathways(p+"R", maze, row, column+1);
        }
        if (row>0) {
            allpathways(p+"U", maze, row-1, column);
        }
        if (column>0) {
            allpathways(p+"L", maze, row, column-1);
        }
        maze[row][column]=true;

    }
    
    //print the matrix path
    public static void allpathwaysPRINT(String p , boolean [][] maze , int row, int column,int [][] path,int step){
        if (row==maze.length-1 && column==maze[0].length-1) {
            path[row][column]=step;
           for (int[] ans : path) {
            System.out.println(Arrays.toString(ans));
           }
           System.out.println(p);
           System.out.println();
           return;
       }
       if (!maze[row][column]) {
           return;
       }
       path[row][column]=step;
       maze[row][column]=false;
       if (row<maze.length-1) {
           allpathwaysPRINT(p+"D", maze, row+1, column,path,step+1);
       }
       if (column<maze[0].length-1) {
           allpathwaysPRINT(p+"R", maze, row, column+1,path,step+1);
       }
       if (row>0) {
           allpathwaysPRINT(p+"U", maze, row-1, column,path,step+1);
       }
       if (column>0) {
           allpathwaysPRINT(p+"L", maze, row, column-1,path,step+1);
       }
       maze[row][column]=true;
       path[row][column]=0;

   }


    ////////////////////////////////////////////////////////////////////////////////////////
    public static void pathrestriction(String p, boolean [][] maze, int row ,int column){
        if (row==maze.length-1 && column==maze[0].length-1) {
            System.out.print(p+" ");
            return;
        }
        if (!maze[row][column]) {
            return;
        }
        if (row<maze.length-1) {
            pathrestriction(p+"D", maze, row+1, column);
        }
        if (column<maze[0].length-1) {
            pathrestriction(p+"R", maze, row, column+1);
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<String> pathrestrictionlist(String p, boolean [][] maze, int row ,int column){
        if (row==maze.length-1 && column==maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (!maze[row][column]) {
            ArrayList<String> list = new ArrayList<>();
            list.add("block");
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row<maze.length-1) {
            ans.addAll(pathrestrictionlist(p+"D", maze, row+1, column));
        }
        if (column<maze[0].length-1) {
            ans.addAll(pathrestrictionlist(p+"R", maze, row, column+1));
        }
        return ans;
    }

}