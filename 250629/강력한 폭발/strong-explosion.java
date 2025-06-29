import java.util.*;
import java.io.*;

class Pair {
    public int x;
    public int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static final int MAX = 20;

    private static int n;
    private static int max;

    private static int[][] types = new int[MAX][MAX];
    private static int[][] bombed = new int[MAX][MAX];
    private static List<Pair> positions = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        
        n = Integer.parseInt(tokens.nextToken());

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                int place = Integer.parseInt(tokens.nextToken());
                if (place > 0) {
                    positions.add(new Pair(i, j));
                }
            }
        }

        find(0);

        System.out.println(max);
    }

    private static void find(int count) {
        if (count == positions.size()) {
            max = Math.max(max, calculate());
            return;
        }

        for (int i = 1; i <= 3; i++) {
            int x = positions.get(count).x;
            int y = positions.get(count).y;

            types[x][y] = i;
            find(count + 1);
            types[x][y] = 0;
        }
    }

    private static int calculate() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bombed[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (types[i][j] > 0) {
                    bomb(i, j, types[i][j]);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bombed[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    private static void bomb(int x, int y, int type) {
        Pair[][] shapes = {
            {},
            {new Pair(-2, 0), new Pair(-1, 0), new Pair(0, 0), new Pair(1, 0), new Pair(2, 0)},
            {new Pair(0, 1), new Pair(1, 0), new Pair (0, 0), new Pair(0, -1), new Pair(-1, 0)},
            {new Pair(-1, -1), new Pair(-1, 1), new Pair(0, 0), new Pair(1, -1), new Pair(1, 1)},
        };

        for (int i = 0; i < 5; i++) {
            int dx = shapes[type][i].x;
            int dy = shapes[type][i].y;

            int nx = x + dx;
            int ny = y + dy;

            if (isInRange(nx, ny)) {
                bombed[nx][ny] = 1;
            }
        }
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < n
                && 0 <= y && y < n;
    }
}