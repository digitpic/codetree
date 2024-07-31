import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        char currChar = str.charAt(0);
        int numChar = 1;

        String encoded = "";

        for(int i = 1; i < len; i++){
            if(str.charAt(i) == currChar){
                numChar++;
            }
            else {
                encoded += currChar;
                encoded += Integer.toString(numChar);
                
                currChar = str.charAt(i);
                numChar = 1;
            }
        }
        
        encoded += currChar;
        encoded += Integer.toString(numChar);
        
        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}