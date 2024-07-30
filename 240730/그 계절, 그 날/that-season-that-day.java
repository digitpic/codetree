import java.util.Scanner;

public class Main {
    public static void solution(int y, int m, int d) {
        // 입력 범위 예외 처리
        if (y < 1 || 3000 < y || m < 1 || 12 < m || d < 1 || d > 31) {
            System.out.println(-1);
            return;
        }

        // 윤년인지 확인
        boolean isLeapYear = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);

        // 달에 따른 일 예외 처리
        if (m == 2) {
            if (isLeapYear && d > 29) {
                System.out.println(-1);
                return;
            } else if (!isLeapYear && d > 28) {
                System.out.println(-1);
                return;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 30) {
                System.out.println(-1);
                return;
            }
        }

        // 계절 출력
        if (m == 12 || m == 1 || m == 2) {
            System.out.println("Winter");
        } else if (3 <= m && m <= 5) {
            System.out.println("Spring");
        } else if (6 <= m && m <= 8) {
            System.out.println("Summer");
        } else if (9 <= m && m <= 11) {
            System.out.println("Autumn");
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