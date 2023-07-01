
/*
 * ou are playing the PUBG game and you entered into the bootcamp. There you viewed the drop box which was filled with guns. you have to choose the biggest gun in the drop box.Find the biggest gun and you will get  the chicken dinner. 
Input Format:

Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

Output Format:

Refer  sample output for details.

Sample Input 1:

5

2

3

6

8

1

Sample Output 1:

8 is the maximum element in the array
 */
import java.util.Scanner;

public class MaximumElementinanArray {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int[] arr = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } // 0 1 2 3 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max + " is the maximum element in the array");
    }
}