package com.devdeep.searchingandsorting;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/

public class Greatestletter {
    public static void main(String[] args) {

        char[] letter = {'a','b','d','g','i','l','o','s'};
        char target = 'l';
        char res = nextGreatestLetter(letter, target);
        System.out.println(res);
        }
    static char nextGreatestLetter(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        int last = arr.length-1;
        char a;
        if(target>arr[last]){
         a = arr[start];
         return  a;   
        }
        while (start<end) {
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }   
        }
        a = arr[end]; // or a = arr[start]
        return a;
    }
}

//the smallest or equal character greater than target

//{
// char[] letter = {'a','b','d','g','i','l','o','s'};
// char target = 'c';
// char res = nextGreatestLetter(letter, target);
// System.out.println(res);
// }
// static char nextGreatestLetter(char[] arr,char target){
// int start = 0;
// int end = arr.length-1;
// int last = arr.length-1;
// char a;
// if(target>arr[last]){
//      a = arr[start];
//     return  a;   
// }
// while (start<=end) {
//     int mid = start+(end-start)/2;
//     if(arr[mid]==target){
//         return arr[mid];
//     }
//     else if(arr[mid]<target){
//         start = mid+1;
//     }
//     else{
//         end = mid-1;
//     }   
// }
// a = arr[start];
// return a;
//}