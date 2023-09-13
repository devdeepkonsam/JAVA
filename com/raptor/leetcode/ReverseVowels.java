package com.raptor.leetcode;
 //https://leetcode.com/problems/reverse-vowels-of-a-string/

// Reverse Vowels of a String    345
//need some code to make it more effecient and speed

public class ReverseVowels{
    public static void main(String[] args) {
        String s = "hello my name is devdeep singha";
        String ans = reverseVowels(s);
        System.out.print(ans);
   }
    static String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start<end) {
            if ( (vowel(s.charAt(start)))  &&  (vowel(s.charAt(end))) ) { //comparing the char in the string if both the char is vowels then swap using xor 
                s = swap(s, start, end); 
                start++; // after swap increase the start and decrease the end
                end--;
            }
            if (!vowel(s.charAt(end))) { // if the end char is not vowel then decrease the end index by 1
                end--;
            }
            if(!vowel(s.charAt(start))) { // if the start char is not vowel then increase the start index by 1
                start++;
            }
       }
       return s;
    }
    static String swap(String str, int i, int j)
    {
        char[] ch = str.toCharArray();
 
        // Swapping using XOR operation
        ch[i] = (char)(ch[i] ^ ch[j]);
        ch[j] = (char)(ch[i] ^ ch[j]);
        ch[i] = (char)(ch[i] ^ ch[j]);
 
        return String.valueOf(ch);
    }
    static boolean vowel(char c){ //funciton to return trure if the char is vowel 
        return (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' || c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'); 
    }
}