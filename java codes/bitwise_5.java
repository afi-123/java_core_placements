/*5.	Given a number N and an array of N elements, find the Bitwise XOR of the array elements.
Input Size : N <= 100000
Sample Testcase :
INPUT
2
2 4
OUTPUT
6
*/
import java.util.Scanner;
public class bitwise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Enter the elements separated by space:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int result = calculateXOR(array);
        System.out.println("Bitwise XOR of the array elements: " + result);
    }

    public static int calculateXOR(int[] array) {
        int xorResult = 0;
        for (int num : array) {
            xorResult ^= num;
        }
        return xorResult;
    }
}
