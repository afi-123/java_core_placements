/*7.You are given a number ‘n’,count the number of 1’s in its binary string.of that number
Input Description:
You are given with the number ‘n’.
Output Description:
Count the number of 1 in string
Sample Input :
4
Sample Output :
1
*/
import java.util.Scanner;
public class num_ones {
    public static void main(String[] args) {
        System.out.println("ENTER THE INTEGER");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = countOnes(n);
        System.out.println(count);
        scanner.close();
    }
    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
