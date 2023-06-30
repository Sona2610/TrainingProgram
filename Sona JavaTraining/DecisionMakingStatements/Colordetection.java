import java.util.Scanner;

public class Colordetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String colour = sc.nextLine();
        if (colour.equals("BLUE")) {
            System.out.println("It is Dawn");
        } else if (colour.equals("RED")) {
            System.out.println("It is Dusk");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
