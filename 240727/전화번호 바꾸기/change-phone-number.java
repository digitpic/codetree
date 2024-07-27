import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        sc.next();

        String numberX = sc.next();
        String numberY = sc.next();

        System.out.println("010-"+numberY+"-"+numberX);


        
    }
}