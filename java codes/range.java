/* 9.You are given a number ‘n’.Your task is to set all the bits to 1 in the position of range [L R] and then print the  new number. Bit count start from 1 and it starts from left
 
Input Description:
You are given a number N, L and R seperated by single space
Output Description:
Print the new number created by setting the bits of the given number to 1 in the range of L to R
Sample Input :
17 2 3
Sample Output :
23
*/

import java.util.Scanner;
public class range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number N, L, and R separated by space: ");
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();
        int newNumber = setBitsInRange(n, l, r);
        System.out.println("New number after setting bits in range [" + l + ", " + r + "]: " + newNumber);
    }
    public static int setBitsInRange(int n, int l, int r) {
        int mask = (1 << (r - l + 1)) - 1; 
        mask <<= (l - 1);
        return n | mask;
    }
}