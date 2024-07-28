import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (true) {
            if ( n <= 1 ) {
                System.out.println(i);
                break;
            }
            n /= i;
            i++;
        }
        
    }
}