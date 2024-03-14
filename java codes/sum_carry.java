/*1.	Write a code to get 2 integers as input and add the integers without any carry.
Input Description:
A single line containing 2 integers.
Output Description:
Print sum of the 2 integers without carry
Sample Input :
44 66
Sample Output :
0
*/

import java.util.*;

public class sum_carry {
    public static int xSum(int n, int m) {
        int res = 0;
        int multiplier = 1;
        int bit_sum;
        while (true) {
            if (n == 0 && m == 0)
                break;
            bit_sum = (n % 10) + (m % 10);
            bit_sum %= 10;
            res = (bit_sum * multiplier) + res;
            n /= 10;
            m /= 10;
            multiplier *= 10;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int m = scanner.nextInt();

        System.out.println("Sum with carry: " + xSum(n, m));

        scanner.close();
    }
}
