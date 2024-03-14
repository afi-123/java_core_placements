import java.util.Scanner;

public class bitwise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers N and K separated by space:");
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int result = performLeftShift(N, K);
        System.out.println("Result after performing bitwise left shift " + K + " times: " + result);
    }

    public static int performLeftShift(int N, int K) {
        return N << K;
    }
}

