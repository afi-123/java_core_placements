/*2.	Write a code to get 2 integers A and N. Print the integer A, N times in separate line.
Input Description:
First line contains an integer A. Second line contains an Integer N.
Output Description:
Print the integer A, N times in a separate line.
Sample Input :
2 3
Sample Output :
2
2
2
*/

import java.util.Scanner;
public class RepeatInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer A: ");
        int A = scanner.nextInt();
        System.out.print("Enter integer N: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(A);
        }
        scanner.close();
    }
}
