/*Generate a hollow inverted half pyramid pattern using numbers.
Input Description:
Given an integer R indicates number of rows.
Where 1<=R<=100.
Output Description:
Print the hollow inverted half pyramid pattern using numbers based on the given integer R.
Sample Input :
5
Sample Output :
    1
   1 2
  1   3
 1     4
1 2 3 4 5
*/

import java.util.Scanner;

public class hollow_inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        generateHollowInvertedHalfPyramid(numRows);
    }

    public static void generateHollowInvertedHalfPyramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = i; j < numRows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == numRows)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}

