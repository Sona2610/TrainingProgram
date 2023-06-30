import java.util.Scanner;

class AliceinWonderland {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 10;
        int c = a % 10;
        int d = b + c;
        System.out.println("Alice must go in path-" + d);
    }
}