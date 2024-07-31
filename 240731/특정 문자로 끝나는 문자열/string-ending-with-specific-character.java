import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String[] arr = new String[n];
        for (int i=0; i<n; i++) 
            arr[i] = sc.next();
        
        char word = sc.next().charAt(0);
        boolean check = true;
        
        for (int i=0; i<n; i++) {
            if (arr[i].charAt(arr[i].length()-1) == word) {
                System.out.println(arr[i]);
                check = false;
            }
        }

        if (check) {
            System.out.println("None");
        }

    }
}