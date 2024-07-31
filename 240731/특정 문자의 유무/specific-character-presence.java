import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean eeExists = false, abExists = false;
        eeExists = str.contains("ee");
        abExists = str.contains("ab");

        if (eeExists) {
            System.out.print("Yes ");
        }
        else {
            System.out.print("No ");
        }
        if (abExists) {
            System.out.print("Yes ");
        }
        else {
            System.out.print("No ");
        }
        
    }
}