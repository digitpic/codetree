import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 12;
    private static final int MAX_K = 4;

    private static int n;
    private static int m;
    private static int k;
    private static int max = Integer.MIN_VALUE;
    private static int[] moves = new int[MAX_N];
    private static int[] status = new int[MAX_K];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());
        k = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int move = Integer.parseInt(tokens.nextToken());
            moves[i] = move;
        }

        for (int i = 0; i < k; i++) {
            status[i] = 1;
        }

        find(0);
        
        System.out.println(max);
    }

    private static void find(int count) {
        max = Math.max(max, calculate());
        
        if (count == n) {
            return;
        }

        for (int i = 0; i < k; i++) {
            if (status[i] >= m) {
                continue;
            }

            status[i] += moves[count];
            find(count + 1);
            status[i] -= moves[count];
        }
    }

    private static int calculate() {
        int point = 0;

        for (int i = 0; i < k; i++) {
            if (status[i] >= m) {
                point++;
            }
        }

        return point;
    }
}