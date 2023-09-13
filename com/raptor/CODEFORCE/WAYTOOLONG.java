package com.raptor.CODEFORCE;
import java.util.Scanner;

public class WAYTOOLONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            int len = word.length();
            if (len<=10) {
                System.out.println(word);
            }
            else{
                System.out.println(""+word.charAt(0)+(len-2)+word.charAt(len-1));
            }
        }
        sc.close();
    }
}
