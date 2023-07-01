/*
 * QUESTION:
Vasya has become interested in wrestling. In wrestling, wrestlers use techniques for which they are awarded points by judges. The wrestler who gets more points wins.

When the numbers of points of both wrestlers are equal, the wrestler whose sequence of points is lexicographically greater wins.

If the sequences of the awarded points coincide, the wrestler who performed the last technique wins.

Note:

Sequence x = x1x2... x|x| is lexicographically larger than sequence y = y1y2... y|y|, if either |x| > |y| and x1 = y1, x2 = y2, ... , x|y| = y|y|, or there is such number r (r < |x|, r < |y|), that x1 = y1, x2 = y2, ... , xr = yr and xr + 1 > yr + 1.

We use notation |a| to denote the length of sequence a.

Write a program to determine which wrestler won.

 

INPUT & OUTPUT FORMAT:
The first input contains an integer n, which corresponds to the number of techniques that the wrestlers have used. Assume maximum values of n is 20.
The next 'n' lines contain integer numbers ai (ai ≠ 0). If ai is positive, that means that the first wrestler performed the technique that was awarded ai points. And if ai is negative, that means that the second wrestler performed the technique that was awarded ( - ai) points.
The techniques are given in chronological order.

The output  --- If the first wrestler wins, print sring " first"(without the quotes), otherwise print " second"(without the quotes).
[All text in bold represents the input, and the remaining represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the number of techniques 
5
Enter the points awarded
1
2
-3
-4
3
second 
SAMPLE INPUT & OUTPUT:
Enter the number of techniques 
3 
Enter the points awarded 
-1
-2
3 
first
SAMPLE INPUT & OUTPUT 3:

Enter the number of techniques
 2
Enter the points awarded
 4
-4
second
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vasyaandwrestling {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        long sum1 = 0, sum2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of techniques ");
        int n = scanner.nextInt();
        int flag = 0;
        System.out.println("Enter the points awarded");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x > 0) {
                a.add(x);
                sum1 += x;
                flag = 1;
            } else {
                b.add(-x);
                sum2 += -x;
                flag = 2;
            }
        }
        if (sum1 > sum2) {
            System.out.println("first");
        } else if (sum2 > sum1) {
            System.out.println("second");
        } else {
            int result = judge(a, b);
            if (result == 1) {
                System.out.println("first");
            } else if (result == 2) {
                System.out.println("second");
            } else if (flag == 1) {
                System.out.println("first");
            } else {
                System.out.println("second");
            }
        }
        scanner.close();
    }

    private static int judge(List<Integer> a, List<Integer> b) {
        int size = Math.min(a.size(), b.size());
        for (int i = 0; i < size; i++) {
            if (a.get(i) > b.get(i)) {
                return 1;
            } else if (b.get(i) > a.get(i)) {
                return 2;
            }
        }
        return 0;
    }
}
