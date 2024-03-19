/*
16.	Given a number N and K followed by N elements and K elements. Now insert the given K elements one by one into the array and print the maximum in the array after each insertion .
Input Size : K <= N <= 10000(read about priority queues and implement)
Sample Testcase :
INPUT
5 2
1 2 3 4 5
5 4
OUTPUT
5 5

*/
import java.util.*;
public class array_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (N) and the number of insertions (K): ");
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] array = new int[N];
        System.out.print("Enter the initial elements of the array: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the elements to insert: ");
        for (int i = 0; i < K; i++) {
            int element = scanner.nextInt();
            array = insertAndPrintMax(array, element);
        }
    }
    static int[] insertAndPrintMax(int[] array, int element) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : array) {
            maxHeap.add(num);
        }
        maxHeap.add(element);
        System.out.println(maxHeap.peek());
        int[] newArray = new int[array.length + 1];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            newArray[i++] = maxHeap.poll();
        }
        return newArray;
    }
}
