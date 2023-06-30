import java.util.Scanner;

class Splitingintoteams {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int team = sc.nextInt();
        int a = num / team;
        int b = num % team;
        System.out.println("The number of students in each team is " + a + " and left out is " + b);
    }
}