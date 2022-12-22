package com.raptor.Projects;

public class Solution {
    public static void main(String []argh){
        int [][] arr =  {{1,2,3},
                        {4,5,6},
                        {9,8,9}};
        System.out.println(diagonaldifferne(arr));
    }  
    public static int diagonaldifferne(int [][] arr){
        int left0pright =0,righttoleft=0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            left0pright += arr[i][i];
            righttoleft += arr[i][len-1-i];
        }
        if (left0pright>righttoleft) {
            return left0pright-righttoleft;
        }
        return righttoleft-left0pright;
        
    }




    // public static int diagonalDifference(List<List<Integer>> arr) {
    //     // Write your code here
    
    // } 

}

        // Scanner sc = new Scanner(System.in);
        // int t=sc.nextInt();
        // for(int i=0;i<t;i++) {
        //     try {
        //         long x=sc.nextLong();
        //         System.out.println(x+" can be fitted in:");
        //         if(x>=-128 && x<=127)System.out.println("* byte");
        //         //Complete the code
        //         if(x>=-32768 && x<=32767)System.out.println("* short");
        //         if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
        //         if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
        //     } catch(Exception e) {
        //         System.out.println(sc.next()+" can't be fitted anywhere.");
        //     }
        // }


// Scanner in = new Scanner(System.in);
//         int t=in.nextInt();
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
//             int ans =0;
//             for (int j = 0; j < n; j++) {         
//                 if (j==0) {
//                     ans  = a+(((int)(Math.pow(2, j)))*b);
//                 }else{
//                     ans = ans+(((int)(Math.pow(2, j)))*b);
//                 }
//                 System.out.print(ans+" ");
//             }
//             System.out.println();
//         }
//         in.close();