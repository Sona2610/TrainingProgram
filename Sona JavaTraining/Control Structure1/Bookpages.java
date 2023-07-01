/*
 * QUESTION:
Rita, a class mentor brought a new book to the class. She decided to gift this book to the student who finds the number of pages in the book. Help the students to complete this task. Assume that every page in a book is numbered sequentially and that the first page is numbered 1.
A 10-page book puzzle can be solved as, Pages 1 to 9 would require 1 digit each (total 9), and page 10 would require 2 digits. This makes 11 digits. Similarly, a book of 34 pages would require 59 digits.
Each line in the input represents the number of digits used in numbering a book. Output is the number of pages the book has. If the number supplied cannot possibly be valid, display "Impossible!" 
 
INPUT & OUTPUT FORMAT:
Input contains a single integer, between 1 and 2,000,000,000, representing a number of digits used in numbering the pages of a book.
If the input value is valid, output the number of pages in the book. Otherwise, output "Impossible!"
Refer to the sample input and output for formatting specifications.
SAMPLE INPUT & OUTPUT 1:
11 
10  
SAMPLE INPUT & OUTPUT 2:
13 
11  
SAMPLE INPUT & OUTPUT 3:
60 
Impossible! 
 */

import java.util.Scanner;

public class Bookpages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            if (n < 10) {
                System.out.println(n);
            } else if (n >= 10 && n < 100) {
                if ((n - 9) % 2 == 0) {
                    System.out.println(9 + (n - 9) / 2);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 100 && n < 1000) {
                if ((n - 54) % 3 == 0) {
                    System.out.println(54 + (n - 54) / 3);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 1000 && n < 10000) {
                if ((n - 369) % 4 == 0) {
                    System.out.println(369 + (n - 369) / 4);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 10000 && n < 100000) {
                if ((n - 2776) % 5 == 0) {
                    System.out.println(2776 + (n - 2776) / 4);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 100000 && n < 1000000) {
                if ((n - 22222) % 6 == 0) {
                    System.out.println(22222 + (n - 22222) / 5);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 1000000 && n < 10000000) {
                if ((n - 198765) % 7 == 0) {
                    System.out.println(198765 + (n - 198765) / 6);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 10000000 && n < 100000000) {
                if ((n - 1789876) % 8 == 0) {
                    System.out.println(1789876 + (n - 1789876) / 7);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 100000000 && n < 1000000000) {
                if ((n - 16210987) % 9 == 0) {
                    System.out.println(16210987 + (n - 16210987) / 8);
                } else {
                    System.out.println("Impossible!");
                }
            } else if (n >= 1000000000 && n < 2000000000) {
                if ((n - 148936496) % 10 == 0) {
                    System.out.println(148936496 + (n - 148936496) / 9);
                } else {
                    System.out.println("Impossible!");
                }
            } else {
                System.out.println("Impossible!");
            }
        }
    }
}
