import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 10;

    private static int n;
    private static int[] jumps = new int[MAX_N];
    private static int step;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        
        tokens = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            jumps[i] = Integer.parseInt(tokens.nextToken());
        }

        find(0, 0);

        if (min == Integer.MAX_VALUE) {
            min = -1;
        }

        System.out.println(min);
    }

    private static void find(int position, int count) {
        if (position >= n - 1) {
            min = Math.min(min, count);
            return;
        }
        
        if (jumps[position] == 0) {
            return;
        }

        for (int j = 1; j <= jumps[position]; j++) {
            find(position + j, count + 1);
        }
    }
}   