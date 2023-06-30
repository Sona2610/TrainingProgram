import java.util.Scanner;

public class Trafficlights {
    public static void main(String[] args) {
        // your code
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("red") || s.equalsIgnoreCase("green") || s.equals("yellow")) {
            if (s.equals("red")) {
                System.out.println("Stop");
            } else if (s.equalsIgnoreCase("green")) {
                System.out.println("Go");
            } else {
                System.out.println("Get Ready");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}