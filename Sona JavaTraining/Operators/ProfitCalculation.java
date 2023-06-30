import java.util.Scanner;

class ProfitCalculation {
    public static void main(String args[]) {
        // fill your code
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sellingprice = X * a;
        int costprice = (b * X) + 100;
        int profit = sellingprice - costprice;
        System.out.println("The profit obtained is Rs." + profit);
    }
}