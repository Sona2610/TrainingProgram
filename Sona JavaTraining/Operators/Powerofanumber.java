import java.util.Scanner;

public class Powerofanumber {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        System.out.println((int) Math.pow(X, N));
    }
}