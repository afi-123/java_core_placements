/*
2.	Given a number N and an array of N elements,sort the array in increasing order and print the original indices of the elements present in sorted array.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
5 4 3 2 1
OUTPUT
5 4 3 2 1

*/
import java.util.*;
class Pair implements Comparable<Pair> {
    int value;
    int index;

    public Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.value, other.value);
    }
}
public class array_sort {
    public static void main(String[] args) 
    {   
        System.out.println("enter the number of elements");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Pair[] array = new Pair[N];
        System.out.println("enter the elements");
        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            array[i] = new Pair(value, i + 1); 
        }
        Arrays.sort(array);
        System.out.println("the elements in sorted order are:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i].index + " ");
        }
    }
}