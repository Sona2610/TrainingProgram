/*
 * QUESTION:
Among other things, Bob is keen on photography. Especially he likes to take pictures of sportsmen. That was the reason why he placed himself in position x0 of a long straight racetrack and got ready to take pictures. But the problem was that not all the runners passed him. The total number of sportsmen training at that racetrack equals to n. And each of them regularly runs distances within a particular segment of the racetrack, which is the same for each sportsman. For example, the first sportsman runs from position a1 to position b1, the second — from a2 to b2

What is the minimum distance that Bob should move to have a chance to take pictures of each sportsman? Bob can take a picture of a sportsman if he stands within the segment that this sportsman covers on the racetrack.



INPUT & OUTPUT FORMAT:

The first line of the input contains integers n and x0 (1 ≤ n ≤ 15; 0 ≤ x0 ≤ 1000). 
The following n lines contain pairs of integers ai, bi (0 ≤ ai, bi ≤ 1000; ai ≠ bi).
Output the required minimum distance in the same units as the positions on the racetrack. If there is no such position, output -1.
SAMPLE INPUT :

3 3
0 7
14 2
4 6
SAMPLE OUTPUT:

1
 */

import java.util.Scanner;

public class Youngphotographer {
    public static void main(String[] args) {
        int maxn = 1006;
        int[] a = new int[maxn];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if (l > r) {
                int temp = l;
                l = r;
                r = temp;
            }
            a[l]++;
            a[r + 1]--;
        }
        int tmp = 0;
        int ans = 1_000_000_000;
        for (int i = 0; i <= 1000; i++) {
            tmp += a[i];
            if (tmp == n) {
                ans = Math.min(ans, Math.abs(i - x));
            }
        }
        if (ans == 1_000_000_000) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
        scanner.close();
    }
}
