/*
8.	Given 2 strings and a number K, check whether they differ exactly by K characters.
Input Size : |s| <= 100000(complexity O(nlogn) or O(n))
Sample Testcase :
INPUT
codekata codeguvi 4
OUTPUT
yes

*/
import java.util.*;
public class array_string_k{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = scanner.next();
        System.out.print("Enter the second string: ");
        String s2 = scanner.next();
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();
        if (s1.length() != s2.length()) {
            System.out.println("The strings do not have the same length.");
            return;
        }
        int differences = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                differences++;
            }
        }
        if (differences == K) {
            System.out.println("Yes, the number of differences equals K.");
        } else {
            System.out.println("No, the number of differences does not equal K.");
        }
    }
}

