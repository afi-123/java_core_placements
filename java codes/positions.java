/*5.In the IPL season’s valedictory function the organizers have organized for a dance program. The dance has to be performed by men along with the points of the diagonals of the square of side ‘n’ and the females along with points of the borders. The remaining positions are filled by children. You have to determine their respective positions by writing a program.
 
Input Description:
Given an integer N indicates representing the matrix (N*N).
where 1<=N<=100.
Output Description:
Print the N*N character matrix with the character F(Female), M(Male), C(Children).
Sample Input :
7
Sample Output :
M F F F F F M
F M C C C M F
F C M C M C F
F C C M C C F
F C M C M C F
F M C C C M F
M F F F F F M
*/
import java.util.Scanner;

public class positions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N*N): ");
        int N = scanner.nextInt();
        scanner.close();
        char[][] matrix = generateMatrix(N);
        printMatrix(matrix);
    }
    public static char[][] generateMatrix(int N) {
        char[][] matrix = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1 || i == j || i + j == N - 1) {
                    matrix[i][j] = 'F'; // Female
                } else {
                    matrix[i][j] = 'C'; // Children
                }
            }
        }
        matrix[0][0] = matrix[0][N - 1] = matrix[N - 1][0] = matrix[N - 1][N - 1] = 'M';

        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

