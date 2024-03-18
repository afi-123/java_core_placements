/*
11.	Given a range (i.e) two numbers L and R count the number of perfect squares within the range (inclusive of L and R).If no perfect square exists within the range print '-1'.
Input Size : L <= R <= 100000(complexity O(n))
Sample Testcase :
INPUT
2 10
OUTPUT
2

*/
import java.util.Scanner;
public class array_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range (L and R): ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int count = countPerfectSquares(L, R);
        if (count > 0) {
            System.out.println("Number of perfect squares within the range: " + count);
        } else {
            System.out.println("-1");
        }
    }
    static int countPerfectSquares(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                count++;
            }
        }
        return count;
    }
}