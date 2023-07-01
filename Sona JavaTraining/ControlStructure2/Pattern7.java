/*
 * Write a program to generate the given pattern. 
if n = 5,

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:
5
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 
 */

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            int x = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}