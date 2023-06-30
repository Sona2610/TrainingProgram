import java.util.Scanner;

public class FavoriteGame {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Game:");
        String game = sc.nextLine();

        System.out.println("My name is " + name + " and I love to play " + game);
    }
}