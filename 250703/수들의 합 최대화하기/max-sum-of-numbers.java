import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 10;

    private static int n;
    private static int[][] grid = new int[MAX_N][MAX_N];
    private static int[] visited = new int[MAX_N];
    private static List<Integer> selected = new ArrayList<>();
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }
            
        find(0);

        System.out.println(max);
    }

    private static void find(int row) {
        if (row == n) {
            max = Math.max(max, calculate());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue;
            }

            visited[i] = 1;
            selected.add(i);

            find(row + 1);

            visited[i] = 0;
            selected.remove(selected.size() - 1);
        }
    }

    private static int calculate() {
        int sum = 0;    

        for (int i = 0; i < n; i++) { 
            sum += grid[i][selected.get(i)];
        }

        return sum;
    }
}   