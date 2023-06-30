import java.util.Scanner;

public class FencingTheGround {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Required length is " + (2 * (a + b)) + "m");
        System.out.println("Required quantity of carpet is " + (a * b) + "sqm");
    }
}