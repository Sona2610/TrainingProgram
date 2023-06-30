
import java.util.Scanner; //importing the class

public class SelecttheStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // togetaninput
        String Stadiumname = sc.nextLine();
        System.out.println("Today's match will be held at " + Stadiumname);// for printing
    }
}