/*2.	Generate a hollow half pyramid pattern using numbers.
Input Description:
Given an integer R indicates number of rows.
Where 1<=R<=100.
Output Description:
Print the hollow half pyramid pattern using numbers based on the given integer R.
Sample Input :
5
Sample Output :
1
12
1 3
1  4
12345
*/

import java.util.Scanner;

public class half_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();
        generateHollowHalfPyramid(numRows);
    }
    public static void generateHollowHalfPyramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == numRows)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

