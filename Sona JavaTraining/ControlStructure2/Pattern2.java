/*
 * Write a program to generate the given pattern.
if n = 4,
****
*  *
*  *
****

 INPUT & OUTPUT FORMAT:

Input consists of a single integer, n. n is always an even integer. n>=6.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.
SAMPLE INPUT & OUTPUT 1:
6
******
*    *
*    *
*    *
*    *
******


SAMPLE INPUT & OUTPUT 2:
4
****
*  *
*  *
****
 */

import java.util.Scanner;

public class Pattern2

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // your code
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
