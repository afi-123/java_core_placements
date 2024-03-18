/*
7.	Given an array, find the absolute minimum difference between any two elements in the array.
Input Size : N <= 1000000(complexity O(n) or O(nlogn))
Sample Testcase :
INPUT
5
0 2 3 4 5
OUTPUT
1

*/
import java.util.*;
public class array_absolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            int difference = array[i + 1] - array[i];
            minDifference = Math.min(minDifference, difference);
        }
        System.out.println("Minimum difference between adjacent elements: " + minDifference);
    }
}
