/*
 * Uniformity matrix is a matrix in which all the elements in the matrix are either completely even or completely odd.

Write a program to find whether a given matrix is a uniformity matrix or not.

 Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.

Output Format:

Print yes if it is a uniformity matrix. Print no if it is not a uniformity matrix.

 Sample Input 1:

2

4 5

5 4

Sample Output 1:

no
 */

import java.util.Scanner;

public class UniformityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int evencount = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arr[i][j] % 2 == 0) {
                    evencount++;
                }
            }
        }
        if (evencount == a * a || evencount == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}