package com.devdeep.recursion;


public class Nqueen {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    
    public static int queens (boolean [][] board,int row){
        if (row==board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        for(int col = 0;col<board.length;col++){
            //place the queen if it is safe
            if (isSafe(board,row,col)) {
                board[row][col]=true;
                count += queens(board, row+1);
                board[row][col]=false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board, int rows, int col) {
        //check vertically
        // for (int i = 0; i < row; i++) {
        //     if (board[i][col]) {
        //         return false;
        //     }
        // }
        int row =rows;
        while (row>=0) {
            if (board[row][col]) {
                return false;
            }
           row--;
        }

        //diagonal left 
        // int maxleft = Math.min(row, col);
        // for (int i = 1; i < maxleft; i++) {
        //     if (board[row-i][col-i]) {
        //         return false;
        //     }
        // }
        int rowI = rows;
        int colI =col;
        while (rowI>=0 && colI>=0) {
            if (board[rowI][colI]) {
                return false;
            }
            --rowI;
            --colI;
        }

        //diagonal right
        // int maxright = Math.min(row, board.length-col-1);
        // for (int i = 1; i <=maxright; i++) {
        //     if (board[row-i][col+i]) {
        //         return false;
        //     }
        // }
        int rowII = rows;
        int colII = col;
        while (rowII>=0 && colII<=board[0].length-1) {
            if (board[rowII][colII]) {
                return false;
            }
            --rowII;
            ++colII;
        }
        return true;  
    }

    //to display the boards
    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for(boolean element : row){
                if (element) {
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
