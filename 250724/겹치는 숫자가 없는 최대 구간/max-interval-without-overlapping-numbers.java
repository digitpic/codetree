import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokens.nextToken());
        int[] numbers = new int[n + 1];
        int[] count = new int[n + 1];

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        int right = 0;
        for (int left = 1; left <= n; left++) {
            while (right + 1 <= n && count[numbers[right + 1]] != 1) {
                count[numbers[right + 1]]++;
                right++;
            }

            max = Math.max(max, right - left + 1);
            count[numbers[left]]--;
        }
        
        System.out.println(max);
    }
}