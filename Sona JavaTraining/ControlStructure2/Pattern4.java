/*
 * Write a program to generate the given pattern.
If n = 4,

1
2 2
3 3 3
4 4 4 4

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n. Assume that n>=3.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:

5
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
 */

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        // your code
        // get vals from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                // System.out.println("");
            }
            System.out.println();
        }
    }
}