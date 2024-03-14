/*6.	Given a number N and an array of N elements, find the maximum of the elements (using Bitwise AND) and print the output.
Input Size N <= 100000
Sample Testcase :
INPUT
4
2 4 4 2
OUTPUT
4
*/
import java.util.Scanner;
public class bitwise_6 {
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
        int result = findMaximum(array);
        System.out.println("Maximum of the elements using bitwise AND: " + result);
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max &= array[i];
        }
        return max;
    }
}
