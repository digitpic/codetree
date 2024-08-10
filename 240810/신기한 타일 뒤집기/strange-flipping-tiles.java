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
        int curIndex = N_MAX*X_MAX/2;
        
        // n번 반복
        for (int i=0; i<n; i++) {
            
            // x 입력
            int num = sc.nextInt();

            // L, R 입력
            char direction = sc.next().charAt(0);

            // white
            if (direction == 'L') {

                // x번 반복
                for (int j=0; j<num; j++) {   
                    tile[curIndex--] = -1;
                }

                /*
                while (num-- > 0) {
                    tile[curIndex] = -1;
                    if (num > 0) curIndex--;
                }
                */

            }

            // black
            else if (direction == 'R') {

                // x번 반복
                for (int j=0; j<num; j++) {   
                    tile[curIndex++] = 1;
                }

                /*
                while (num-- > 0) {
                    tile[curIndex] = 1;
                    if (num > 0) curIndex++;
                }
                */

            }
            /*
            주석 코드 사용 시 인덱스 재조정 과정 필요 없음
            */

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