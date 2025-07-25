import java.util.*;
import java.io.*;

public class Main {
    private static int MAX = 1_000_000;

    private static int n;
    private static int k;
    private static int[] numbers = new int[MAX + 1];
    private static int[] count = new int[3];
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        k = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }

        int right = 0;
        for (int left = 1; left <= n; left++) {
            while (right + 1 <= n && count[1] < k) {
                count[numbers[right + 1]]++;
                right++;
            }
            
            if (count[1] >= k) {
                min = Math.min(min, right - left + 1);
            }
            
            count[numbers[left]]--;
        }
        
        System.out.println(min != Integer.MAX_VALUE ? min : -1);
    }
}