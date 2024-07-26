public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp = 0;

        // a -> b
        temp = b; // temp 6
        b = a;
        a = temp;

        // b -> c
        temp = c; // temp 7
        c = a;
        a = temp;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}