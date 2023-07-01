/*
QUESTION:
On one hot summer day, Peter and his friend Billy decided to buy a watermelon. In their opinion, they chose the biggest and the ripest one. After that, the watermelon was weighed, and the scales showed w kilos. They rushed home, dying of thirst, and decided to divide the berry. However, they faced a hard problem.

Peter and Billy are great fans of even numbers. That's why they wanted to divide the watermelon in such a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. But the difference between the 2 parts should be minimal. The boys are extremely tired and want to start their meal as soon as possible. That's why you should help them and find out if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.

 

INPUT FORMAT:

The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.

OUTPUT FORMAT:

If the input value is not within the range, print "Invalid Input".
In the first line of the output, print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.
If the first line of the output is YES, the next line of the output consists of 2 integers separated by a space. In the case of distinct integers, the smallest number should appear first.
[Text in bold represents the output].
SAMPLE INPUT & OUTPUT 1:

8
YES
4 4
SAMPLE INPUT & OUTPUT 2:

11
NO
SAMPLE INPUT & OUTPUT 3:

124
Invalid Input



*/

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        // your code
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = w / 2;
        if (1 > w || w > 100) {
            System.out.println("Invalid Input");
        } else if (w % 2 == 0) {
            System.out.println("YES");
            System.out.println(a + " " + a);
        } else if (w % 2 != 0) {
            System.out.println("NO");
        }

    }
}
