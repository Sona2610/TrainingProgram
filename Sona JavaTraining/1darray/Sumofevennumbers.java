/*
 * kuty and pappu plays a coding game. kuty give a set of numbers to pappu to find the even numbers in the set and sum that. Help pappu to solve the game and to win the diary milk.

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

Sample Output 1:

The sum of the even numbers in the array is 16
 */

import java.util.Scanner;

public class Sumofevennumbers {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                x += arr[i];
            }
        }
        System.out.println("The sum of the even numbers in the array is " + x);
    }
}