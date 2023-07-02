
/*Write a program to scan the string from the user and to print it.

Input Format:

Input consist of 1 string.
Sample Input & Output:

Hello World

The string is Hello World/* */
import java.util.Scanner;

public class PrinttheString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The string is " + s);
        // Write your code
    }
}