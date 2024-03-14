/*1.	Given 2 numbers N and K print the number after performing bitwise right shift 'K' times(upto 2 decimal places).
Input Size : 1 <= N, K <= 1000
Sample Testcase :
INPUT
5 2
OUTPUT
1
*/
import java.util.Scanner;
public class bitwise_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers N and K separated by space:");
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        int result = performRightShift(N, K);
        System.out.println("Result after performing bitwise right shift " + K + " times: " + result);
    }
    public static int performRightShift(int N, int K) {
        return N >> K;
    }
}

