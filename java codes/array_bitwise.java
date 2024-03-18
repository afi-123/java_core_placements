/*
4.	Given a number N and an array of N elements, find the Bitwise XOR of the array elements.
Input Size : N <= 100000
Sample Testcase :
INPUT
2
2 4
OUTPUT
6

*/
import java.util.Scanner;
public class array_bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int xorResult = 0;
        for (int i = 0; i < N; i++) {
            xorResult ^= array[i];
        }
        System.out.println("XOR of array elements: " + xorResult);
    }
}
