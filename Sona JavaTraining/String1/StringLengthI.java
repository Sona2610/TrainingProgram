
/*
 * Write a  program to find the length of the given string using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

Java

The length of Java is 4
 */
import java.util.Scanner;

public class StringLengthI {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("The length of " + s + " is " + s.length());
    }
}