import java.util.Scanner;

public class Petrolvariety {
    public static void main(String[] args) {
        // your code
        Scanner sc = new Scanner(System.in);
        float m = sc.nextFloat();
        int o = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        float b = sc.nextFloat();
        if (d < m) {
            if (b > s && b > o) {
                System.out.println("Speed");
            } else {
                System.out.println("Ordinary");
            }
        } else if ((d / m) == (b / s)) {
            System.out.println("Speed");
        } else if (d >= m) {
            if (b > o || b < s) {
                System.out.println("Ordinary");
            } else {
                System.out.println("Speed");
            }
        }

    }
}
