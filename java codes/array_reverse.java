/*
14.	You are given with string of words,we have to arrange them in reverse saturated order.
Input Description:
You are given a string ‘s’.
Output Description:
Print the reverse saturated order
Sample Input :
I am kohli fan
Sample Output :
I ma ilhok naf
s
*/
import java.util.*;
public class array_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string of words:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(reverseWord(words[i])).append(" ");
        }
        System.out.println(reversed.toString().trim());
    }
    static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}