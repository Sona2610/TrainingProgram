import java.util.Scanner;

public class InterschoolTrophy {
    public static void main(String[] args) {
        String i, j, a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Team 1:");
        System.out.println("Team Name:");
        i = sc.nextLine();
        System.out.println("Score:");
        a = sc.nextLine();
        System.out.println("Overs played:");
        b = sc.nextLine();
        System.out.println("Team 2:\nTeam Name:");
        j = sc.nextLine();
        System.out.println("Score:");
        c = sc.nextLine();
        System.out.println("Overs played:");
        d = sc.nextLine();
        System.out.println("Match Details:");
        System.out.println("Team 1:");
        System.out.println("Name: " + i);
        System.out.println("Score: " + a);
        System.out.println("Overs played: " + b);
        System.out.println("Team 2:");
        System.out.println("Name: " + j);
        System.out.println("Score: " + c);
        System.out.println("Overs played: " + d);
    }
}
