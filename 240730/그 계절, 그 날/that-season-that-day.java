import java.util.Scanner;
public class Main {
    public static void solution(int y, int m, int d) {

        // 윤년인 경우
        if ( (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) ) {
            // 2월
            if (m == 2) {
                if (d < 1 || 29 < d) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        // 평년인 경우
        else {
            // 2월
            if (m == 2) {
                if (d < 1 || 28 < d) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        // 31일
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d < 1 || 31 < d) {
                System.out.println(-1);
                return;
            }
        }

        // 30일
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d < 1 || 30 < d) {
                System.out.println(-1);
                return;
            }
        }

        // 달 출력
        if (3 <= m && m <= 5) {
            System.out.println("Spring");
        }
        else if (6 <= m && m <= 8) {
            System.out.println("Summer");
        }
        else if (9 <= m && m <= 11) {
            System.out.println("Fall");
        }
        else if (m == 12 || m == 1 || m == 2) {
            System.out.println("Winter");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();

        solution(year, month, date);
    }
}