/*
 * QUESTION:
Amr loves Chemistry, and especially doing experiments. He is preparing for a new interesting experiment.

Amr has n different types of chemicals. Each chemical i has an initial volume of ai litres. For this experiment, Amr has to mix all the chemicals together, but all the chemicals volumes must be equal first. So his task is to make all the chemicals volumes equal.

To do this, Amr can do two different kinds of operations.

Choose some chemical i and double its current volume so the new volume will be 2ai
Choose some chemical i and divide its volume by two (integer division) so the new volume will be 
Suppose that each chemical is contained in a vessel of infinite volume. Now Amr wonders what is the minimum number of operations required to make all the chemicals volumes equal?



INPUT & OUTPUT FORMAT:
The first line contains an integer n, which corresponds to the number of chemicals. Assume the maximum value of n as 20.
The next 'n' lines contain integers ai (1 ≤ ai ≤ 105), which represents the initial volume of the i-th chemical in liters. 
The output is an integer, which represents the minimum number of operations required to make all the chemicals volumes equal.
[All text in bold represents the input, and the rest represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the number of chemicals
3
Enter the initial volume of chemicals in litres
4
8
2
The minimum number of operations = 2
SAMPLE INPUT & OUTPUT 2:
Enter the number of chemicals
3
Enter the initial volume of chemicals in litres
3
5
6
The minimum number of operations = 5
 */

import java.util.Arrays;
import java.util.Scanner;

public class AmrandChemistry {
    static final int inf = 88888888;
    static final int maxn = 100060;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of chemicals");
        int[] a = new int[maxn];
        Node[] vis = new Node[maxn];
        for (int i = 0; i < maxn; i++) {
            vis[i] = new Node();
        }

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Arrays.fill(vis, 0, n + 1, new Node());
            System.out.println("Enter the initial volume of chemicals in litres");
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
                deal(a[i], vis);
            }

            int num = inf;
            for (int i = 1; i <= 100000; i++) {
                if (vis[i].num == n) {
                    if (vis[i].minmum < num) {
                        num = vis[i].minmum;
                    }
                }
            }

            System.out.println("The minimum number of operations = " + num);
        }

        scanner.close();
    }

    static void deal(int x, Node[] vis) {
        int n = x;
        int bushu = 0;

        while (n <= 100000) {
            vis[n].num++;
            vis[n].minmum += bushu;
            bushu++;
            n *= 2;
        }

        n = x;
        bushu = 0;
        while (n > 0) {
            if (x != n) {
                vis[n].num++;
                vis[n].minmum += bushu;
            }
            if (n % 2 == 1 && n != 1) {
                int t = bushu + 2;
                int y = n / 2 * 2;
                while (y <= 100000) {
                    vis[y].num++;
                    vis[y].minmum += t;
                    t++;
                    y *= 2;
                }
            }
            bushu++;
            n /= 2;
        }
    }

    static class Node {
        int minmum;
        int num;
    }
}
