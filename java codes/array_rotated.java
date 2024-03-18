/*
3.	Given an value 'M' follwed by array of M elements in which the elements would have been rotated for certain 'N' times from the intial array representation where all elements are arranged in ascending order.Print the 'N' or print -1 if there is no rotation made or cannot be determined.Note: 1<=N<=length of the given array.Sample Testcase :
INPUT
5
15 18 2 3 6 12
OUTPUT
2

*/
import java.util.Scanner;
public class array_rotated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int M = scanner.nextInt();
        int[] arr = new int[M];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < M; i++) {
            arr[i] = scanner.nextInt();
        }
        int rotationCount = findRotationCount(arr);
        System.out.println("Rotation Count: " + rotationCount);
    }
    public static int findRotationCount(int[] arr) {
        int length = arr.length;
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        if (minIndex == 0) {
            return 0;
        }
        return minIndex;
    }
}
