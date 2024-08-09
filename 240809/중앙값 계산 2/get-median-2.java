import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        for (int i=0; i<n; i++)
            numArr[i] = sc.nextInt();

        for (int i=0; i<n; i++) {
            

            // 홀수번째 숫자 입력 받을 때
            if (i%2 == 0) {    
                // 현재 값까지 정렬
                Arrays.sort(numArr, 0, i+1);
                // 중앙값 출력
                System.out.print(numArr[i/2] + " ");
            } 

        }

            
    }
}