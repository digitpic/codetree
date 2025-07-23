import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokens.nextToken());
        int s = Integer.parseInt(tokens.nextToken());
        int[] numbers = new int[n];

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += numbers[j]; 
                if (sum < s) {
                    continue;
                }
                min = Math.min(min, j - i + 1);
            }
        }

        if (min == Integer.MAX_VALUE) {
            min = -1;
        }

        System.out.println(min);
    }
}