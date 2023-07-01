/*
 * Write a program to find the number of distinct elements in a sorted array.

Input Format:

Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next n integers correspond to the elements in the array. Assume that the maximum value of n is 15.

Output Format:

Output consists of a single integer which corresponds to the number of distinct elements in the array.

Sample Input:

5

3

3

3

78

90

Sample Output:

3
 */

import java.util.Scanner;

public class DistinctElement {
    public static void main(String[] args) {
        int res;
        int x;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        res = n;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                if (arr[i] == arr[i + 1]) {
                    res--;
                }
            }

        }
        System.out.print(res);
    }
}