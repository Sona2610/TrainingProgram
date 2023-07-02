
/*
 * A lower triangular matrix is a square matrix in which all the elements above the diagonal are zero. That is, all the non-zero elements are in the lower triangle. Write a program to find whether a given matrix is a lower triangular matrix or not.

Input Format:
The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.

Output Format:
Print yes if it is a lower triangular matrix . Print no if it is not a lower triangular matrix. 

Sample Input 1:
2
1 0
2 3 

Sample Output 1:
yes
 */
import java.util.*;

public class LowerTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    System.out.println("yes");
                    return;
                } else {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}