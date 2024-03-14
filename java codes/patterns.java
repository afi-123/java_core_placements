/*1.	Generate a floyd's triangle.
Input Description:
Given an integer R indicates number of rows.
Where 1<=R<=100.
Output Description:
Print a floyd's triangle based on the given integer R.
Sample Input :
5
Sample Output :
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        generateFloydsTriangle(numRows);
    }

    public static void generateFloydsTriangle(int numRows) {
        int num = 1;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
