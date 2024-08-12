import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        sc.close();

        if (s1 <= s2 && s2 <= e1 || s2 <= e1 && e1 <= e2)
            System.out.println("intersecting");
        else 
            System.out.println("nonintersecting");

    }
}