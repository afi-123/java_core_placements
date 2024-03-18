/*
5.	Given a string S,count the maximum number of times a character repeated in the string.If no character is repeated print '0'.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
codekata
OUTPUT
2

*/
import java.util.*;
public class array_string_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char ch : input.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }
        int maxFrequency = 0;
        for (int freq : charFrequency.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        if (maxFrequency <= 1) {
            System.out.println("No repeated characters.");
        } else {
            System.out.println("Maximum frequency of a character: " + maxFrequency);
        }
    }
}

