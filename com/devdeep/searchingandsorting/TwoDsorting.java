package com.devdeep.searchingandsorting;

//https://leetcode.com/problems/search-a-2d-matrix/

class pair  
{  
    int first, second;  
    public pair(int first,int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}




//integer are sorted in rowsize from left to right.

public class TwoDsorting {
    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};
        System.out.println(searchMatrixII(arr, 1));

        int [][] arr1 = {
          {1,10,20},
          {5,11,22},
          {8,16,25}
        }  ; 
        pair ans = searchMatrix(arr1, 11);
        System.out.println("["+ans.first+","+ans.second+"]");
        
    }
    //search starts from lastrow and 0th column 
   

    

     public static pair searchMatrix(int[][] matrix, int target) {
      pair ans = new pair(0, 0);
      int row =matrix.length-1;  //length for row 
      int tolcol= matrix[row].length-1;   //length for column in row
      int col = 0;
      while(row>=0 && col<=tolcol){       //Row-wise sorted 2D array 
        if(matrix[row][col]==target){     //comaparing for the target
          ans.first =row;
          ans.second = col;
          return ans;

        }
        else if(matrix[row][col]>target){ //if the element is greater than target move to above up
          row--;
        }
        else{
          col++;                          //if the element is less than target move to column to right
        }
      }  
      return ans;
     }



     //https://leetcode.com/problems/search-a-2d-matrix-ii/
     public static boolean searchMatrixII(int[][] matrix, int target) {   //matrix sorted in both rowwise and column wise
      int row = 0;                         //initial row =0
      int col = matrix[0].length-1;        //column = last
      while(row<matrix.length && col >=0){
        if(matrix[row][col]==target){
          return true;
        }
        else if(matrix[row][col]<target){   //if the element less than target move the row downward
          row++;
        }
        else{                               //if the element greater than target move the column right
          col--;
        }
      }
      return false;
        
    }
    
}












