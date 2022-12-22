package com.devdeep.recursion;


public class Nknights{
    public static void main(String[] args) {
        int n = 5;
        boolean [][] arr = new boolean[n][n];
        knights(arr, 0, 0, 5);
    }

    public static void knights(boolean[][] board,int row, int col,int knights){
        if (knights==0) {
            display(board);
            System.out.println();
            return;
        }

        //if the current index is in th last row and the column index gets bounds of its len
        //return
        if (row==board.length-1 && col==board.length) {
            return;
        }
        //if the current index gets +1 of last column move to next line/row;
        if (col==board.length) {
            knights(board, row+1,0, knights);
            return;
        }
        if (isSafe(board,row,col)) {
            board[row][col]=true;
            knights(board, row, col+1, knights-1);
            board[row][col]=false;
        }
        //if the current index is not safe than move to next column
        knights(board, row, col+1, knights);

    }
    

    private static boolean isSafe(boolean[][] board,int row,int col) {
        if (isvalid(board, row-2 , col-1)) {
            if (board[row-2][col-1]) {
                return false;
            }
        }
        if (isvalid(board, row-2, col+1)) {
            if (board[row-2][col+1]) {
                return false;
            }
        }
        if (isvalid(board, row-1, col-2)) {
            if (board[row-1][col-2]) {
                return false;
            }
        }
        if (isvalid(board, row-1, col+2)) {
            if (board[row-1][col+2]) {
                return false;
            }
        }
        return true;
    }


    public static boolean isvalid(boolean [][] board,int row, int col){
        if (row>=0 && row<board.length && col>=0 && col<board.length) {
            return true;
        }
        return false;
    }



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
