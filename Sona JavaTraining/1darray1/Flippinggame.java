/*
 * UESTION:
Lahub got bored, so he invented a game to be played on paper.

He writes n integers a1, a2, ..., an. Each of those integers can be either 0 or 1. He's allowed to do exactly one move: he chooses two indices i and j (1 ≤ i ≤ j ≤ n) and flips all values ak for which their positions are in range [i, j] (that is i ≤ k ≤ j). Flip the value of x means to apply operation x = 1 - x.

The goal of the game is that after exactly one move, we need to obtain the maximum number of ones. Write a program to solve the little game of Lahub.



INPUT & OUTPUT FORMAT:
The first input contains an integer n. Assume the maximum value of n as 25.
The next 'n' inputs contain an integer. It is guaranteed that each of those n values is either 0 or 1.
The output displays the maximal number of 1s that can be obtained after exactly one move.
[All text in bold represents the input, and the remaining represents the output.]
SAMPLE INPUT & OUTPUT 1:

Enter the value of n
5
Enter 5 values
1 0 0 1 0
Maximum number of ones = 4
SAMPLE INPUT & OUTPUT 2:
Enter the value of n
4
Enter 4 values
1 0 0 1
Maximum number of ones = 4
 */

import java.util.Scanner;

public class Flippinggame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of n
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();

        // Read the sequence of values
        System.out.println("Enter " + n + " values");
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        // Find the maximal number of ones
        int maxOnes = findMaxOnes(values);

        // Print the result
        System.out.println("Maximum number of ones = " + maxOnes);
    }

    private static int findMaxOnes(int[] values) {
        int maxOnes = 0;
        int n = values.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int ones = countOnes(values, i, j);
                maxOnes = Math.max(maxOnes, ones);
            }
        }

        return maxOnes;
    }

    private static int countOnes(int[] values, int start, int end) {
        int ones = 0;
        for (int i = start; i <= end; i++) {
            if (values[i] == 1) {
                ones++;
            }
        }
        return ones;
    }
}