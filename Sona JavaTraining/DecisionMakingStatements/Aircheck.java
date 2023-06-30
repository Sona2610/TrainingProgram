import java.util.Scanner;

public class Aircheck {
    public static void main(String[] args) {
        // your code
        // get vals from user
        Scanner sc = new Scanner(System.in);
        float fl = sc.nextFloat();
        float rl = sc.nextFloat();
        float rr = sc.nextFloat();
        float fr = sc.nextFloat();
        if (fl == 33) {
            System.out.println("Front-left : Untouched");
        } else if (fl > 33) {
            System.out.println("Front-left : Deflate");
        } else {
            System.out.println("Front-left : Inflate");
        }
        // if(fr==33){
        // System.out.println("Front-right : Untouched");}
        // else if(fr>33){
        // System.out.println("Front-right : Deflate");}
        // else{
        // System.out.println("Front-right : Inflate");}
        if (rl == 32) {
            System.out.println("Rear-left : Untouched");
        } else if (rl > 32) {
            System.out.println("Rear-left : Deflate");
        } else {
            System.out.println("Rear-left : Inflate");
        }

        if (rr == 32) {
            System.out.println("Rear-right : Untouched");
        } else if (rr > 32) {
            System.out.println("Rear-right : Deflate");
        } else {
            System.out.println("Rear-right : Inflate");
        }
        if (fr == 33) {
            System.out.println("Front-right : Untouched");
        } else if (fr > 33) {
            System.out.println("Front-right : Deflate");
        } else {
            System.out.println("Front-right : Inflate");
        }
    }
}