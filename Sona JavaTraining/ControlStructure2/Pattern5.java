/*
 * Write a program to generate the given pattern.
if n=4,

4 
3 3 
2 2 2 
1 1 1 1 

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:

5
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 

 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
            }
            a -= 1;
            System.out.println();
        }
    }
}