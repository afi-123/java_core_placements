/*4.	Print the position of first 1 from right to left, in binary representation of an Integer.
Sample Testcase :
INPUT
18
OUTPUT
2
*/
import java.util.Scanner;
public class bitwise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        scanner.close();
        int position = findFirstOnePosition(num);
        System.out.println("Position of the first 1 from right to left: " + position);
    }
    public static int findFirstOnePosition(int num) {
        String binary = Integer.toBinaryString(num);
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                return binary.length() - i;
            }
        }
        return -1;
    }
}
