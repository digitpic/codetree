import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static int[][] grid;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        grid = new int[n][n];

        for (int row = 0; row < n; row++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int column = 0; column < n; column++) {
                grid[row][column] = Integer.parseInt(tokens.nextToken());
            }
        }
            
        find();
    }

    private static void 
}