import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 1000;
    public static int n, m;

    public static ArrayList<Integer>[] graph = new ArrayList[MAX_NUM + 1];
    public static boolean[] visited = new boolean[MAX_NUM + 1];
    public static int vertexCnt = 0;

    public static void dfs(int vertex) {
        for(int i = 0; i < graph[vertex].size(); i++) {
            int currV = graph[vertex].get(i);
            if(!visited[currV]) {
                visited[currV] = true;
                vertexCnt++;
                dfs(currV);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();

        while(m-- > 0) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        visited[1] = true;
        dfs(1);
        System.out.println(vertexCnt);
    }
}
