import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static List<Integer> series = new ArrayList<>();
    private static int[] numbers = new int[]{4, 5, 6};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        find(0);
    }

    private static void find(int count) {
        if (count == n) {
            for (int i = 0; i < series.size(); i++) {
                System.out.print(series.get(i));
            }

            System.exit(0);
        }

        for (int i = 0; i < 3; i++) {
            series.add(numbers[i]);

            if (isPossible()) {
                find(count + 1);
            }

            series.remove(series.size() - 1);
        }
    }

    private static boolean isPossible() {
        int length = 1;

        while (true) {
            int end1 = series.size() - 1;
            int start1 = end1 - length + 1;

            int end2 = start1 - 1;
            int start2 = end2 - length + 1;

            if (start2 < 0) {
                break;
            }

            if (isEqual(start1, end1, start2, end2)) {
                return false;
            }

            length++;
        }

        return true;
    }

    private static boolean isEqual(int start1, int end1, int start2, int end2) {
        for (int i = 0; i <= end1 - start1; i++) {
            if (series.get(start1 + i) != series.get(start2 + i)) {
                return false;
            }
        }

        return true;
    }
}