import java.util.Scanner;

public class Tollpass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        float o = sc.nextFloat();
        float t = sc.nextFloat();
        float m = sc.nextFloat();

        if (o > t) {
            System.out.println("Invalid Input");
        } else if (x == y) {
            System.out.println("One way pass + Two way pass");
        } else {
            System.out.println("Monthly Pass");
        }
    }
}