/*
15.Given an array arr[] and a number K where K is smaller than the size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are NOT distinct.
Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N
 
Input Description:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test case consists of three lines. First line of each test case contains an integer N denoting size of the array. Second line contains N space separated integer denoting elements of the array. Third line of the test case contains an integer K.
Output Description:
Corresponding to each test case, print the desired output in a new line.
Sample Input :
2
6
7 10 4 3 3 4 
3
5
7 10 4 15 15
4
Sample Output :
7
15

*/
import java.util.*;
public class array_kth_smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            System.out.print("Enter the size of the array: ");
            int N = scanner.nextInt(); 
            int[] arr = new int[N];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.print("Enter the value of K: ");
            int K = scanner.nextInt(); 
            int result = findKthSmallest(arr, K);
            System.out.println("Kth smallest element is: " + result);
        }
    }
    static int findKthSmallest(int[] arr, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }
        for (int i = 0; i < K - 1; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
