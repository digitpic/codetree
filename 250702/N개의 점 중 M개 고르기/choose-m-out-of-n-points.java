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
    private static int n;
    private static int m;
    private static List<Pair> points = new ArrayList<>();
    private static List<Pair> selected = new ArrayList<>();
    private static List<Pair> pair = new ArrayList<>();

    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokens.nextToken());
            int y = Integer.parseInt(tokens.nextToken());
            points.add(new Pair(x, y));
        }
        
        find(0, 0);

        System.out.println(min);
    }

    private static void find(int index, int count) {
        if (count == m) {
            max = Integer.MIN_VALUE;
            findPair(0, 0);
            min = Math.min(min, max);
            return;
        }

        if (index == n) {
            return;
        }

        selected.add(points.get(index));
        find(index + 1, count + 1);
        selected.remove(selected.size() - 1);

        find(index + 1, count);
    }

    private static void findPair(int index, int count) {
        if (count == 2) {
            Pair first = pair.get(0);
            Pair second = pair.get(1);
            max = Math.max(max, calculate(first, second));
            return;
        }

        if (index == m) {
            return;
        }
        
        pair.add(selected.get(index));
        findPair(index + 1, count + 1);
        pair.remove(pair.size() - 1);

        findPair(index + 1, count);
    }

    private static int calculate(Pair first, Pair second) {
        return (int) Math.pow(first.x - second.x, 2)
                + (int) Math.pow(first.y - second.y, 2);
    }
}
