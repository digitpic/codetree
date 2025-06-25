import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX = 1000;

    private static int n; // vertex
    private static int m; // edge
    private static List<Integer>[] graph = new ArrayList[MAX + 1];
    private static boolean[] visited = new boolean[MAX + 1];
    private static int vertexCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
            
        while (m-- > 0) {
            tokens = new StringTokenizer(reader.readLine());
            int first = Integer.parseInt(tokens.nextToken());
            int second = Integer.parseInt(tokens.nextToken());

            graph[first].add(second);
            graph[second].add(first);
        }

        visited[1] = true;
        dfs(1);
        System.out.println(vertexCount);
    }

    private static void dfs(int vertex) {
        for (int i = 0; i < graph[vertex].size(); i++) {
            int current = graph[vertex].get(i);

            if (!visited[current]) {
                visited[current] = true;
                vertexCount++;
                dfs(current);
            }
        }
    }
}
