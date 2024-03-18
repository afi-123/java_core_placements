/*
1.	Given a number N and an array of N elements, find the sum of the maximum elements obtained by considering all consecutive pairs of adjacent elements.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
1 2 3 4 5
OUTPUT
14
*/
import java.util.Scanner;
public class array_sum {
    public static void main(String[] args) {
        System.out.println("enter th number of elements");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("enter the elements");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        long sum = 0; 
        for (int i = 0; i < N - 1; i++) {
            sum += Math.max(arr[i], arr[i + 1]);
        }
        System.out.println("sum is:");
        System.out.println(sum);
        scanner.close();
    }
}
