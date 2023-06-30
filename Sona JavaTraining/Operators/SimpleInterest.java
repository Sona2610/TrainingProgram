import java.util.Scanner;

class SimpleInterest {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();

        System.out.println((a * b * c) / 100);
    }
}