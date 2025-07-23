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

        int sum = 0;
        int left = 0;
        int min = Integer.MAX_VALUE;
        
        for (int right = 0; right < n; right++) {
            sum += numbers[right];

            while (sum >= s) {
                min = Math.min(min, right - left + 1);
                sum -= numbers[left];
                left++;
            }
        }

        if (min == Integer.MAX_VALUE) {
            min = -1;
        }

        System.out.println(min);
    }
}