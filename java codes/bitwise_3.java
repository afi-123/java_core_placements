/*3.	Given an array of N elements switch(swap) the element with the adjacent element and print the output.
Sample Testcase :
INPUT
5
3 2 1 2 3
OUTPUT
2 3 2 1 3
*/
import java.util.Scanner;
public class bitwise_3 {
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

        switchAdjacentElements(array);
        System.out.println("Output after switching adjacent elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void switchAdjacentElements(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}

