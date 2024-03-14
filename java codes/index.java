/*6.	You are given with an array containing only 1s and 0s.You can select two index ‘a’ and ‘b’ such that a<b in which you will change ‘1 to 0’ and ‘0 to 1’,in order to get maximum no of 1s in result.
Input Description:
You are given with array of 1’s and 0’s
Output Description:
Print the two index ‘a’ and ‘b‘.Print -1 if we don’t require a and b
Sample Input :
1111100
Sample Output :
5 7
*/
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array of 1's and 0's: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] result = findIndices(input);
        if (result[0] == -1 && result[1] == -1) {
            System.out.println("-1");
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
    }

    public static int[] findIndices(String input) {
        char[] arr = input.toCharArray();
        int maxOnes = countOnes(arr);
        int[] indices = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char[] copyArr = input.toCharArray();
                swapElements(copyArr, i, j);
                int onesCount = countOnes(copyArr);
                if (onesCount > maxOnes) {
                    maxOnes = onesCount;
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public static void swapElements(char[] arr, int i, int j) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int countOnes(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
