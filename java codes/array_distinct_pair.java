/*
9.	Given an array A of N elements, count the number of distinct pairs (i,j) such that i < j and A[i] < A[j].If no such pairs can be made print -1
Sample Testcase :
INPUT
5
1 2 3 4 5
OUTPUT
10

*/
import java.util.*;
public class array_distinct_pair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] < A[j]) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("Count of distinct pairs: " + count);
        } else {
            System.out.println("No such distinct pairs exist. Result: -1");
        }
    }
}
