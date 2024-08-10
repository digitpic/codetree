import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // n 명의 학생
        int[] student = new int[n];

        for (int i=0; i<m; i++) {
            // 학생 번호를 인덱스로 변경하기 위해 -1
            int index = sc.nextInt()-1;
            student[index]++;
            if (student[index] >= k) {
                // 인덱스를 학생 번호로 변경하기 위해 +1
                System.out.println(index+1);
                return;
            }
        }

        // 출력
        System.out.println(-1);
        
    }
}