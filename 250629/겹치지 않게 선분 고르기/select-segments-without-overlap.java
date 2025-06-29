import java.util.*;

class Pair {
    public int x;
    public int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static final int MAX = 15;

    private static int n;
    private static Pair[] segments = new Pair[MAX];
    private static List<Pair> selected = new ArrayList<>();

    private static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            segments[i] = new Pair(x1, x2);
        }

        find(0);
        
        System.out.println(max);
    }

    private static void find(int count) {
        if (count == n) {
            if (isPossible()) {
                max = Math.max(max, selected.size());
            }
            return;
        }

        selected.add(segments[count]);
        find(count + 1);
        selected.remove(selected.size() - 1);
        find(count + 1);
    }

    private static boolean isPossible() {
        for (int i = 0; i < selected.size(); i++) {
            for (int j = i + 1; j < selected.size(); j++) {
                if (isOverlapped(selected.get(i), selected.get(j))) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isOverlapped(Pair first, Pair second) {
        return first.x <= second.x && second.x <= first.y
                || first.x <= second.y && second.y <= first.y
                || second.x <= first.x && first.x <= second.y
                || second.x <= first.y && first.y <= second.y;
    }
}