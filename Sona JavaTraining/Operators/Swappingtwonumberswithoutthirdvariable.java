
import java.util.Scanner;

public class Swappingtwonumberswithoutthirdvariable {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // getting input
        int y = sc.nextInt();
        x = x + y; // swap
        y = x - y;
        x = x - y;
        System.out.println(x); // printing
        System.out.println(y);
    }
}