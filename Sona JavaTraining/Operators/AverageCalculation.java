
import java.util.Scanner;

public class AverageCalculation {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        float mark1 = sc.nextFloat();
        float mark2 = sc.nextFloat();
        float mark3 = sc.nextFloat();
        float mark4 = sc.nextFloat();
        float mark5 = sc.nextFloat();
        float average = ((mark1 + mark2 + mark3 + mark4 + mark5) / 5);
        System.out.println(average);

    }
}