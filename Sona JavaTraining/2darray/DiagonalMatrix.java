
/*
 * Diagonal Matrix. A square matrix which has zeros everywhere other than the main diagonal. Entries on the main diagonal may be any number, including 0.

Write a program to find whether a given matrix is a diagonal matrix or not.

 Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.

Output Format:

Print yes if it is a diagonal matrix. Print no if it is not a diagonal matrix.

 

Sample Input :

2

4 5

5 4

Sample Output:

no


 */
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i != j) {
                    if (arr[i][j] != 0) {
                        System.out.println("no");
                        return;
                    }
                }
            }
        }
        System.out.println("yes");
    }
}