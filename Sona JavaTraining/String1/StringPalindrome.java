import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        // ring s2=s1.reverse();
        if (s.equals(s1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        // Write your code
    }
}