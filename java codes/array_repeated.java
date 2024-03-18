/*
12.	Given 2 numbers N,K and an array of N elements, print the number(s) that has been repeated K times.Print them in ascending order if there are more than one number to be printed.If no element satisfies the pattern then print -1
Input Size : N,K <= 100000
Sample Testcase :
INPUT
5 2
1 2 4 1 2
OUTPUT
1 2

*/
import java.util.*;
public class array_repeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        boolean found = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == K) {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}
