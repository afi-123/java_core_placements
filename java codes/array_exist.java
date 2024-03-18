/*
10.	Given 2 numbers N,X and an array of N elements, check if there exists any 2 numbers in the array with sum equal to X.If found print 'yes' otherwise print 'no'
Input Size : N,X <= 100000
Sample Testcase :
INPUT
4 4
2 2 0 0
OUTPUT
yes

*/
import java.util.*;
public class array_exist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        System.out.print("Enter the value of X: ");
        int X = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            if (set.contains(X - num)) {
                System.out.println("Yes, there exists a pair that sums up to " + X + ".");
                return; 
            }
            set.add(num);
        }
        System.out.println("No such pair exists that sums up to " + X + ".");
    }
}

