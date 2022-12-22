package com.devdeep.searchingandsorting;


public class LinearSearch{
    public static void main(String[] args) {
        int [] arr = {12,34,6,433,54,3};
        System.out.println(findnumber(arr));

    }
    static int findnumber(int [] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
                
            }
        }
        return count;
    }


    static boolean even(int a){
        return(digit(a)%2==0);
    }

    static int digit(int num){
        int count =0;
        while(num>0){
           num /= 10;
           count++;
        }
        return count;

    }
}







// int [][] arr ={{23,45,56},
//                    {23,55,6},
//                    {8,9,10},
//                    {11,12,13}};
//     System.out.println(max(arr));


// }
// static int max(int[][] nums){
//     int max = nums[0][0];
//     for (int i = 0; i < nums.length; i++) {
//         for (int j = 0; j < nums[i].length; j++) {
//             if (nums[i][j]>max) {
//                 max = nums[i][j];
                
//             }
            
//         }
        
//     }
//     return max;
// }








//     int [] arr ={5,9,8,45,32};
//     System.out.println(max(arr));
//     System.out.println(min(arr));
// static int max(int[] nums){
//     int max =nums[1];
//     for (int i = 0; i < nums.length; i++) {
//         if(nums[i]>max){
//             max = nums[i];
//         }
        
//     }
//     return max;
// }
// static int min(int[] nums){
//     int min = nums[1];
//     for (int i = 0; i < nums.length; i++) {
//         if(nums[i]<min){
//             min= nums[i];
//         }
        
//     }
//     return min;
//}







    // int [] arr ={1,6,4,7,34,54} ;
    // int tar = 34;
    // int s = 2;
    // int e =5;  
    // System.out.println(search(arr, tar, s, e)); 
    // }

    // static boolean search (int[] nums , int tar, int start , int end){
    //     for(int index=start;index>=end;start++){
    //         if(nums[index]==tar){
    //             return true;
    //         }

    //     }
    //     return false;
    //}






// String name = "Devdeep";
//     char tar = 'd';
//     System.out.println(search(name,tar));
       
// }
// static boolean search (String str,char tar){
//     for (int i = 0; i < str.length(); i++) {
//         if(str.charAt(i)==tar){
//             return true;
//         }
        
//     }
//     return false;
//}










//     int [] arr ={2 ,5 ,6,8,9,12,45,32,54,56};
//         int taregt = 4;
       
//         System.out.println(linear(arr, taregt));

    
        
//     }

//     //serrch for a number in the array and return the index for the array
//     //otherwise return -1
//     static boolean linear(int[] nums,int target){
//         if(nums.length==0){
//             return false;
//         }
//         for (int i = 0; i < nums.length;i++){
//             if (nums[i]==target){
//             return true;
//             }
//         }
//         return false;
//}