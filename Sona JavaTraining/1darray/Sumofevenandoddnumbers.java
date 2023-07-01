/*
 * Arun and Kalai were playing a puzzle game in a given set of numbers. They need to find the odd and even numbers and to find the sum of the odd and even. Help them to solve the puzzle game and to win the mobile phone.
Input Format:

Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

Output Format:

Refer sample output for details.

Sample Input :

5

2

3

6

8

-1

Sample Output :

The sum of the even numbers in the array is 16

The sum of the odd numbers in the array is 8


 */

import java.util.Scanner;

public class Sumofevenandoddnumbers {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int x1 = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                x += arr[i];
            }
            //

            else if (arr[i] % 2 != 0) {
                x1 += arr[i];
            }
        }
        System.out.println("The sum of the even numbers in the array is " + x);
        System.out.println("The sum of the odd numbers in the array is " + x1);

    }
}