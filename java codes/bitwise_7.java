/*7.	Given a number N, print the Bitwise NOT of that number.
Input Size : 1 <= N <= 10000
Sample Testcase :
INPUT
5
OUTPUT
-6
*/

import java.util.Scanner;
public class bitwise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = scanner.nextInt();
        scanner.close();
        int result = findBitwiseNOT(N);
        System.out.println("Bitwise NOT of the number: " + result);
    }
    public static int findBitwiseNOT(int N) {
        return ~N;
    }
}

