
/*
 * Write a program to generate the given pattern.
if n = 5,

*   *
 * *
  *
 * *
*   *

 

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n. 
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:

5
*   *
 * *
  *
 * *
*   *
 */
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
