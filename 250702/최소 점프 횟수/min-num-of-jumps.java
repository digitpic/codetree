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

        find(0);

        System.out.println(min);
    }

    private static void find(int count) {
        if (count == n) {            
            min = Math.min(min, step);
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (jumps[i] == 0) {
                min = -1;
                return;
            }

            step = 1;
            
            for (int j = 1; j <= jumps[i]; j++) {
                step += jumps[i];
                find(count + 1);
                step -= jumps[i];
            }
        }
    }
}