import java.util.Scanner;

public class Petrolbunks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int s = sc.nextInt();
        float m = sc.nextFloat();
        char b = sc.next().charAt(0);
        if (b == 'A') {
            System.out.printf("%.2f\n", s / m);
            System.out.printf("%.2f", 0 / m);
        } else if (b == 'B') {
            System.out.printf("%.2f\n", d / m);
            System.out.printf("%.2f", (s - d) / m);
        }
    }
}