import java.util.Scanner;

public class Weathercheck {
    public static void main(String[] args) {
        // your code
        Scanner sc = new Scanner(System.in);
        String condition = sc.nextLine();
        if (condition.equals("sunny")) {
            System.out.println("Yes I can drive :)");
        } else if (condition.equals("misty")) {
            System.out.println("Sorry invalid input :|");
        } else {
            System.out.println("No I cant drive :(");
        }
    }
}
