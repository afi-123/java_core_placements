/*Write a code to get 2 integers as input and find the HCF of the 2 integer without using recursion or Euclidean algorithm.
Input Description:
A single line containing 2 integers separated by space.
Output Description:
Print the HCF of the integers.
Sample Input :
2 3
Sample Output :
1
*/

import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers separated by space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        int hcf = findHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
    public static int findHCF(int num1, int num2) {
        int smaller = Math.min(num1, num2);
        int hcf = 1;
        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; 
            }
        }

        return hcf;
    }
}
