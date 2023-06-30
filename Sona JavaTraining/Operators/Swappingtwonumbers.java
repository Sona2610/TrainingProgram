import java.util.Scanner; //importing

class SwappingtwoSnumbers {
    public static void main(String args[]) {
        // fill your code
        int c;
        Scanner sc = new Scanner(System.in); // creating class
        int a = sc.nextInt(); // getting input from user
        int b = sc.nextInt();

        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}