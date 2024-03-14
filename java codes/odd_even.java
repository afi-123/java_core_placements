/*3.	Write a code get an integer number as input and print the odd and even digits of the number separately.
Input Description:
A single line containing an integer.
Output Description:
Print the even and odd integers of the integer in a separate line.
Sample Input :
1234
Sample Output :
2 4
1 3
*/
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        separateOddEvenDigits(number);
    }

    public static void separateOddEvenDigits(int number) {
        String numberStr = Integer.toString(number);
        System.out.println("Even digits:");
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
        }
        System.out.println("\nOdd digits:");
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
        }
    }
}
