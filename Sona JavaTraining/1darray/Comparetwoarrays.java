/*
 * Raju live with a family.There are four members in his family.Dad Mom Raju and his brother. Ramu live with a family.Dad , Mom, Ramu and his Brother. You have to compare the family members and calculate the members in the family and find the family is same or not.

Input Format:

Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The next ‘n’ integers correspond to the elements in the second array.Assume that the maximum value of n is 15.

Output Format:

Print yes if the 2 arrays are the same. Print no if the 2 arrays are different.

Sample Input 1:

5

2

3

6

8

-1

2

3

6

8

-1

Sample Output 1:

yes


 */

import java.util.Scanner;

public class Comparetwoarrays {
    public static void main(String[] args) {
        // Write your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr1[i] && arr[n - 1] == arr1[n - 1]) {
                System.out.println("yes");
                break;
            } else {
                System.out.println("No");
                break;
            }

        }
    }
}