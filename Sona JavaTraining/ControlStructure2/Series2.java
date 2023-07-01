
/*
 * QUESTION:
Write a program to generate the first n terms in the series 

121,225,361,...

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space.

SAMPLE INPUT:

4
SAMPLE OUTPUT:

121 225 361 529

 */
import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        // your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 11;
        System.out.print((b * b));
        for (int i = 1; i < n; i++) {
            b += 4;
            System.out.print(" " + (b * b));
        }
    }
}