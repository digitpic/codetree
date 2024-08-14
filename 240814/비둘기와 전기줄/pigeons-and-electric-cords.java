import java.util.Scanner;

public class Main {

    public static final int UNDEFINED = -1;
    public static final int MAX_PIGEON = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 비둘기들의 현재 위치
        // 0 ~ 9
        int[] pos = new int[MAX_PIGEON];

        // 전부 -1 로 초기화
        for (int i=0; i<MAX_PIGEON; i++)
            pos[i] = UNDEFINED;

        // 입력된 비둘기 번호 저장을 위함
        int[] pigeon = new int[n];

        // 입력된 위치 정보 저장을 위함
        int[] moveDir = new int[n];

        // 입력 받기
        for (int i=0; i<n; i++) {

            // 몇 번 비둘기
            pigeon[i] = sc.nextInt() - 1;

            // 어느 위치
            moveDir[i] = sc.nextInt();

        }
        
        // 입력된 정보를 바탕으로 비둘기들의 도로 횡단 횟수 계산
        int moveCnt = 0;
        for (int i = 0; i < n; i++) {

            // 해당 번호 비둘기의 첫 이동인 경우
            if( pos[pigeon[i]] == UNDEFINED) {

                // 비둘기 위치 옮기기
                pos[pigeon[i]] = moveDir[i];

            }
            
            // 해당 번호 비둘기가 첫 이동이 아닌 경우
            else if (pos[pigeon[i]] != moveDir[i]) {

                // 비둘기 위치 옮기고
                pos[pigeon[i]] = moveDir[i];

                // 이동 횟수 증가
                moveCnt++;

            }

        } // endFor

        System.out.print(moveCnt);

    }
}