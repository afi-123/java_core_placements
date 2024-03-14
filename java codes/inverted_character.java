/*Generate the following inverted character with star pattern.
bbbb*bbbb
bbb***bbb
bb*****bb
b*******b
*********
Input Description:
Input consists of a single integer that corresponds to R, the number of rows. R is always an odd number. where 1<=R<=100.
Output Description:
Print the inverted character pattern from the given input size R.
Sample Input :
5
Sample Output :
bbbb*bbbb
bbb***bbb
bb*****bb
b*******b
*********
*/
import java.util.Scanner;
public class inverted_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        generateInvertedCharacterPattern(numRows);
    }

    public static void generateInvertedCharacterPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("b");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("b");
            }
            System.out.println();
        }
    }
}

