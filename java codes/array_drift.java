/*
6.	Vishal is learning to skate on ice. He's a beginner, so his only mode of transportation is pushing off from a snow drift to the north, east, south or west and sliding until he lands in another snow drift. He has noticed that in this way it's impossible to get from some snow drifts to some other by any sequence of moves. He now wants to heap up some additional snow drifts, so that he can get from any snow drift to any other one. He asked you to find the minimal number of snow drifts that need to be created. We assume that Vishal can only heap up snow drifts at integer coordinates. The first line of input contains a single integer N the number of snow drifts. Each of the following n lines contains two integers xi and yi the coordinates of the i-th snow drift. Note that the north direction coinсides with the direction of Oy axis, so the east direction coinсides with the direction of the Ox axis. All snow drift's locations are distinct.
Input Size : 1 <= N,Xi,Yi <= 1000
Sample Testcase :
INPUT
2
2 1
1 2
OUTPUT
1

*/
import java.util.*;
public class array_drift {
    static class SnowDrift {
        int x;
        int y;

        public SnowDrift(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] parent;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of snow drifts: ");
        int N = scanner.nextInt();
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
        SnowDrift[] snowDrifts = new SnowDrift[N];
        System.out.println("Enter the coordinates of each snow drift:");
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            snowDrifts[i] = new SnowDrift(x, y);
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (snowDrifts[i].x == snowDrifts[j].x || snowDrifts[i].y == snowDrifts[j].y) {
                    union(i, j);
                }
            }
        }
        int components = countComponents(N);
        int additionalSnowDrifts = components - 1;
        System.out.println("Additional snow drifts needed: " + additionalSnowDrifts);
    }
    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }

    static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = find(parent[a]);
    }

    static int countComponents(int N) {
        Set<Integer> components = new HashSet<>();
        for (int i = 0; i < N; i++) {
            components.add(find(i));
        }
        return components.size();
    }
}
