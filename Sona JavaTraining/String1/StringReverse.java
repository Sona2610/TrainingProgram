import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        System.out.println("The reversed String is " + s1);
    }
}