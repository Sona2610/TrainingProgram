import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        String ans = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(ans);
    }
}