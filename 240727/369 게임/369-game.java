import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            if (i % 3 == 0 || String.valueOf(i).matches(".*[369].*")) {
                System.out.print("0 ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    
    }
}