
/*
 * QUESTION:
Bishop Cotton High School was celebrating, as their school’s Grade 10 students have come out with flying colors in their board exams. School management was overwhelmed by the outperforming achievement of the students and organised a celebration to honor the top scorers. Too many students have procured 100 on 100 in all the subjects. Hence, at the celebrations, the management presented the proficiency certificate for all of the top scorers and centum scorers. 
The management also wanted to provide surprise awards to a few students. Those few students are selected based on their roll numbers. The criterion, applied on the roll numbers, is the concept of lucky numbers. Lucky numbers are those positive numbers whose decimal representation contains only the digits 4 and 7. All the lucky roll numbers are taken into consideration for award giving. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not. 
Now, write a program to find out if the given roll number is almost lucky or not. 

INPUT FORMAT:
The input consists of a single integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.

OUTPUT FORMAT:

The output prints "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).
Refer to the sample input and output for formatting specifications. 
[All text in bold corresponds to the output and the rest corresponds to input.]
SAMPLE INPUT & OUTPUT 1:
Enter the number
47
YES
SAMPLE INPUT & OUTPUT 2:
Enter the number
16
YES
SAMPLE INPUT & OUTPUT 3:
Enter the number
78
NO

 */
import java.util.Scanner;

public class SurpriseAwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a >= 1 || a <= 1000) {
            if (a == 4 || a == 7 || a == 47 || a == 74 || a == 444 || a == 777 || a == 747 || a == 474 || a == 774
                    || a == 447) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
