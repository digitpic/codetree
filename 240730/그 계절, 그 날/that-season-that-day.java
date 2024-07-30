import java.util.Scanner;
public class Main {
    public static void solution(int y, int m, int d) {

        // 입력 범위 예외 처리
        if (y < 1 || 3000 < y) {
            System.out.println(-1);
        }
        if (m < 1 || 12 < m) {
            System.out.println(-1);
        }
        if (d < 1 || 31 < d) {
            System.out.println(-1);
        }

        // 윤년인 경우
        if ( (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) ) {
            // 달에 따른 일 예외 처리
            // 홀수 달
            if (m % 2 == 1) {
                if (d < 1 && 31 < d) {
                    System.out.println(-1);
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
                System.out.println("Autumn");
            }
            else if (m == 12 || m == 1 || m == 2) {
                System.out.println("Winter");
            }
        }

        // 윤년이 아닌 경우
        else {
            // 달에 따른 일 예외 처리
            // 짝수 달
            if (m % 2 == 0) {
                if (d < 1 && 30 < d) {
                    System.out.println(-1);
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
                System.out.println("Autumn");
            }
            else if (12 <= m && m <= 2) {
                System.out.println("Winter");
            }
            
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