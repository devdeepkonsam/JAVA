package com.raptor.leetcode;
//https://leetcode.com/problems/flipping-an-image/description/
public class FlippinganImage{
    public static void main(String[] args) {
        int [][] arr =  {{1,0,0,1,1,1,1,0},
                         {1,0,1,0,1,0,0,1},
                         {0,0,0,0,1,0,1,1},
                         {1,0,1,0,1,1,0,0},
                         {0,1,0,0,0,1,1,1},
                         {1,1,0,0,1,1,1,0},
                         {1,0,1,0,1,0,0,1},
                         {1,0,1,0,1,0,0,1}};
        flipAndInvertImage(arr);
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        //reverse each row
        int len = image.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len/2; j++) {
                //swap
                int temp = image[i][j];
                image[i][j]=image[i][len-j-1];
                image[i][len-j-1]=temp;
            }
        }
        //invert
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (image[i][j]==1)image[i][j]=0;
                else image[i][j]=1;
            }
        }
        return image;
    }
}