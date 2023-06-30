import java.util.Scanner;

public class DistanceSpeedCheck

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d = sc.nextFloat();
        float s = sc.nextFloat();
        float h = sc.nextFloat();
        double max = s * h;
        if (d <= 0 || s <= 0 || h <= 0) {
            System.out.println("Invalid Input");
        } else {
            if (d <= max) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}