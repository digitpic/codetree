import java.util.*;
import java.io.*;

public class Main {

    private static int MAX = 100_000;
    private static int n;
    private static int m;

    private static int[] first = new int[MAX + 1];
    private static int[] second = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            first[i] = Integer.parseInt(tokens.nextToken());
        }
        
        tokens = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= m; i++) {
            second[i] = Integer.parseInt(tokens.nextToken());
        }
        
        
        System.out.println(isSubsequence() ? "Yes" : "No");
    }

    private static boolean isSubsequence() {
        int firstIndex = 1;

        for (int secondIndex = 1; secondIndex <= m; secondIndex++) {
            while (firstIndex <= n && first[firstIndex] != second[secondIndex]) {
                firstIndex++;
            }

            if (firstIndex == n + 1) {
                return false;
            } else {
                firstIndex++;
            }
        }

        return true;
    }

}