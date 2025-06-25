import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX = 25;

    private static int n;
    private static int[][] grid = new int[MAX][MAX];
    private static boolean[][] visited = new boolean[MAX][MAX];
    private static List<Integer> peopleNumbers = new ArrayList<>();
    private static int peopleNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());

        for (int row = 0; row < n; row++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int column = 0; column < n; column++) {
                grid[row][column] = Integer.parseInt(tokens.nextToken());
            }
        }

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (isMovable(row, column)) {
                    visited[row][column] = true;
                    peopleNumber = 1;

                    dfs(row, column);
                    peopleNumbers.add(peopleNumber);
                }
            }
        }

        Collections.sort(peopleNumbers);

        System.out.println(peopleNumbers.size());

        for (int index = 0; index < peopleNumbers.size(); index++) {
            System.out.println(peopleNumbers.get(index));
        }
    }

    private static void dfs(int x, int y) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for (int direction = 0; direction < 4; direction++) {
            int newX = x + dx[direction];
            int newY = y + dy[direction];

            if (isMovable(newX, newY)) {
                visited[newX][newY] = true;
                peopleNumber++;
                dfs(newX, newY);
            }
        }

    }

    private static boolean isMovable(int x, int y) {
        if (!isInRange(x, y)) {
            return false;
        }

        if (visited[x][y]) {
            return false;
        }

        if (grid[x][y] == 0) {
            return false;
        }

        return true;
    }

    private static boolean isInRange(int x, int y) {
        return (0 <= x && x < n) && (0 <= y && y < n);
    }
}