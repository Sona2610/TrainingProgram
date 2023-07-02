import java.util.Scanner;

public class StringCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s;
        System.out.println("The copied String is " + s1);
    }
}