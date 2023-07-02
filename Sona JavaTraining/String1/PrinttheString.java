/*
 * 
 Write a program to scan the string from the user and to print it.

Input Format:

Input consist of 1 string.
Sample Input & Output:

Hello

The string is Hello


 */

import java.util.Scanner;

public class PrinttheString {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("The string is " + s);
    }
}