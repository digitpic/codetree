import java.util.*;
import java.io.*;

public class Main {

    private static int MAX = 100;
    private static int INF = (int)1e9;

    private static int n;
    private static int m;
    private static int u;
    private static int v;
    private static int w;
    private static int[][] graph = new int[MAX + 1][MAX + 1];
    private static int[] visited = new int[MAX + 1];
    private static int[] distance = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        for (int i = 1; i <= m; i++) {
            tokens = new StringTokenizer(reader.readLine());
            u = Integer.parseInt(tokens.nextToken());
            v = Integer.parseInt(tokens.nextToken());
            w = Integer.parseInt(tokens.nextToken());
            graph[u][v] = w;
        }

        for (int i = 1; i <= n; i++) {
            distance[i] = INF;
        }
        distance[1] = 0;

        dijkstra();

        for (int i = 2; i <= n; i++) {  
            System.out.println(distance[i] == INF ? -1 : distance[i]);
        }
    }

    private static void dijkstra() {
        for (int i = 1; i <= n; i++) {
            int minIndex = -1;

            for (int j = 1; j <= n; j++) {
                if (visited[j] == 1) {
                    continue;
                }

                if (minIndex == -1 || distance[minIndex] > distance[j]) {
                    minIndex = j;
                }
            }

            visited[minIndex] = 1;

            for (int j = 1; j <= n; j++) {
                if (graph[minIndex][j] == 0) {
                    continue;
                }

                distance[j] = Math.min(distance[j], distance[minIndex] + graph[minIndex][j]);
            }
        }
    }

}