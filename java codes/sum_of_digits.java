/*4.	Write a code get an integer number as input and print the sum of the digits.
Input Description:
A single line containing an integer.
Output Description:
Print the sum of the digits of the integer.
Sample Input :
124
Sample Output :
7
*/
import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}