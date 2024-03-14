/* 10.You are given a number ‘n’ you have to tell whether number is divisible by 8.
Print 1 if it is divisible and 0 if it is not.
Input Description:
You are given a number ‘n’.
Output Description:
Print 1 if number is divisible by 8 and 0 if not
Sample Input :
16
Sample Output :
1
*/

import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        int result = (n & 7) == 0 ? 1 : 0;
        System.out.println(result);
    }
}