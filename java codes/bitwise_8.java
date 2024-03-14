/*8.	Given a binary number convert it to hexadecimal.
Sample Testcase :
INPUT
1100100
OUTPUT
64
*/
import java.util.Scanner;
public class bitwise_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binary = scanner.nextLine();
        scanner.close();
        String hexadecimal = convertBinaryToHexadecimal(binary);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }
    public static String convertBinaryToHexadecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimal).toUpperCase();
    }
}
