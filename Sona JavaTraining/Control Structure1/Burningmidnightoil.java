
/*
 * QUESTION:
One day a highly important task was commissioned to Vasya — writing a program in a night. The program consists of n lines of code. Vasya is already exhausted, so he works like this: first, he writes v lines of code, drinks a cup of tea, then he writes as much as  lines, drinks another cup of tea, then he writes  lines and so on: , , , ...

The expression  is regarded as an integral part from dividing number a by number b.

The moment the current value  equals 0, Vasya immediately falls asleep and he wakes up only in the morning when the program should already be finished.

Vasya is wondering, what minimum allowable value v can take to let him write not less than n lines of code before he falls asleep.



INPUT & OUTPUT FORMAT:
The input consists of 2 integers.
The first input consists of an integer n ( 1 ≤ n ≤ 109 ), which corresponds to the size of the program in lines
The second input consists of an integer k (2 ≤ k ≤ 10), which corresponds to the productivity reduction coefficient.
The output displays the minimum value of v that lets Vasya write the program in one night.
[All text in bold represents the input, rest represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the size of the program in lines 
7 
Enter the productivity reduction coefficient
2
The minimum value = 4

 */
import java.util.Scanner;

public class Burningmidnightoil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the program in lines: ");
        int n = scanner.nextInt();

        System.out.print("Enter the productivity reduction coefficient: ");
        int k = scanner.nextInt();

        int minimumV = findMinimumV(n, k);

        System.out.println("The minimum value = " + minimumV);
    }

    public static int findMinimumV(int n, int k) {
        int v = 1;

        while (true) {
            int remainingLines = n;
            int roundLines = v;

            while (roundLines > 0) {
                if (remainingLines <= roundLines) {
                    return v;
                }

                remainingLines -= roundLines;
                roundLines /= k;
            }

            v++;
        }
    }
}
