import java.util.Scanner;
public class Main {

    public static int N_MAX = 1000;
    public static int X_MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // index range: 0 ~ 100,000
        // using index: 0 ~ 100,000
        // initial with 0

        // L -> -1: white
        // R -> 1: black 
        int[] tile = new int[N_MAX*X_MAX+1];

        // middle
        int curIndex = 50000;
        
        // n번 반복
        for (int i=0; i<n; i++) {
            
            // x 입력
            int num = sc.nextInt();
            // L, R 입력
            String direction = sc.next();

            // white
            if (direction.equals("L")) {

                // x번 반복
                for (int j=0; j<num; j++) {   
                    tile[curIndex--] = -1;
                }

            }

            // black
            else if (direction.equals("R")) {

                // x번 반복
                for (int j=0; j<num; j++) {   
                    tile[curIndex++] = 1;
                }

            }

            // 마지막 위치로 이동
            // white
            if (direction.equals("L")) {
                curIndex++;
            }

            // black
            else if (direction.equals("R")) {
                curIndex--;
            }

        }

        int countWhite = 0;
        int countBlack = 0;

        for (int i=0; i<=N_MAX*X_MAX; i++) {
            if (tile[i] == -1)
                countWhite++;
            else if (tile[i] == 1)
                countBlack++;
        }

        System.out.println(countWhite + " " + countBlack);

    }
}