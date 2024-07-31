import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
    
        int cnt = 0;
        int sum = 0;
        double avg = 1.0;

        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        char word = sc.next().charAt(0);        
        
        for (int i=0; i<n; i++) {
            if (arr[i].charAt(0) == word) {
                cnt++;
                sum += arr[i].length();
            }
        }
        avg = (double) sum / (double) cnt;
        
        System.out.printf("%d %.2f", cnt, avg);
    }
}