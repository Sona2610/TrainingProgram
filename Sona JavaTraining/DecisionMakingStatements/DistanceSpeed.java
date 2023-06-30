import java.util.Scanner;

public class DistanceSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double speed = sc.nextDouble();
        String st = sc.next();
        String ct = sc.next();
        // Exact hours and minutes from string:
        int csh = Integer.parseInt(st.split(":")[0]);
        int csm = Integer.parseInt(st.split(":")[1]);
        int ch = Integer.parseInt(ct.split(":")[0]);
        int cm = Integer.parseInt(ct.split(":")[1]);
        // calculating the total time
        double traveltime = (distance / speed) * 60;
        int ttc = (csh - ch) * 60 + (csm - cm);
        if (ttc <= 0) {
            System.out.println("Invalid Input");
        } else if (traveltime <= ttc) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}