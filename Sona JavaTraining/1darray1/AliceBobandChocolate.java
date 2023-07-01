/*
 * QUESTION:
Alice and Bob like games. And now they are ready to start a new game. They have placed n chocolate bars in a line. Alice starts to eat chocolate bars one by one from left to right, and Bob — from right to left. For each chocolate bar, the time needed for the player to consume is known (Alice and Bob eat them with equal speed). When the player completes consuming a chocolate bar, he immediately starts with another. It is not allowed to eat two chocolate bars at the same time, to leave the bar unfinished and to make pauses. If both players start to eat the same bar simultaneously, Bob leaves it to Alice as a true gentleman.

How many bars each of the players will consume?



INPUT & OUTPUT FORMAT:

The first line contains one integer n (1 ≤ n ≤ 105) — the number of bars on the table. 
The second line contains a sequence t1, t2, ..., tn (1 ≤ ti ≤ 1000), where ti is the time (in seconds) needed to consume the i-th bar (in the order from left to right).
Print two numbers a and b, where a is the number of bars consumed by Alice, and b is the number of bars consumed by Bob.

SAMPLE INPUT:

5
2 9 8 2 7
SAMPLE OUTPUT:

 2 3
 */

import java.util.Scanner;

public class AliceBobandChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextLong();
        }
        long t1 = 0, t2 = 0;
        int num1 = 0, num2 = 0;
        int l = 1, r = n;
        while (l <= r) {
            if (t1 <= t2) {
                t1 += a[l++];
                num1++;
            } else {
                t2 += a[r--];
                num2++;
            }
        }
        System.out.println(num1 + "" + num2);
        scanner.close();
    }
}