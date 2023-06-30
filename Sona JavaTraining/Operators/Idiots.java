import java.util.Scanner;

class Idiots {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float a = (x1 + y1) / 2;
        float b = (x2 + y2) / 2;
        System.out.println("Binoy's house is located at (" + a + "," + b + ")");
    }
}