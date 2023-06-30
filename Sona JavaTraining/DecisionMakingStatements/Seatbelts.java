import java.util.Scanner;

public class Seatbelts {
    public static void main(String[] args) {
        // your code
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        if (a.equalsIgnoreCase("Yes") && b.equalsIgnoreCase("Yes") && c.equalsIgnoreCase("Yes")) {
            System.out.println("Yes I can drive");
        } else if (a.equalsIgnoreCase("No") && b.equalsIgnoreCase("No") && c.equalsIgnoreCase("No")) {
            System.out.println("No I can't drive");
        } else {
            System.out.println("Invalid Input");
        }

    }
}