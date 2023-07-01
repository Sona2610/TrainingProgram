/*
 * Write a program to generate the given pattern.
if n=4,
   *
  * *
 *   *
*     *
 *   *
  * *
   *

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:
6
     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *


 */

import java.util.*;

public class Pattern3 {
    public static void printPattern(int n) {
        int i, j;
        int num = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
}
