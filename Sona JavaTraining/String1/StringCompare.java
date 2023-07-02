import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if (s.equals(s1)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
}