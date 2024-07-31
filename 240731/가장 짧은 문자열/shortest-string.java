import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        

        int max = Math.max(l1, Math.max(l2, l3));
        int min = Math.min(l1, Math.min(l2, l3));
        int diff = max - min;
        
        System.out.println(diff);   

    }
}