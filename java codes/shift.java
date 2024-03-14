/*8.You are given an integer ‘n’,You have to shift all the even bits with odd bits and odd bits with even bits, and print the number which is formed after manipulation in O(1) time complexity
Input Description:
You are given a number ‘n’
Output Description:
Print the bit manipulated number
Sample Input :
23
Sample Output :
43
*/

import java.util.Scanner;
public class shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        int manipulatedNumber = swapOddEvenBits(n);
        System.out.println("Bit manipulated number: " + manipulatedNumber);
    }
    public static int swapOddEvenBits(int n) {
        int evenBits = n & 0xAAAAAAAA; 
        int oddBits = n & 0x55555555; 
        evenBits >>= 1;
        oddBits <<= 1;
        return evenBits | oddBits;
    }
}