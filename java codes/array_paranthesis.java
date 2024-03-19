/*
13.	Given a string S consisting of only '(' and ')', print 'yes' if it is balanced otherwise print 'no'.
Sample Testcase :
INPUT
(())
OUTPUT
yes

*/
import java.util.*;
public class array_paranthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string consisting of only '(' and ')': ");
        String input = scanner.nextLine();
        if (isBalanced(input)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; 
                }
            }
        }
        return stack.isEmpty(); 
    }
}