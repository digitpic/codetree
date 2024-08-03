import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);
        
        chagneNumber(aWrapper, bWrapper);
        
        a = aWrapper.value;
        b = bWrapper.value;

        System.out.println(a + " " + b);
    }

    public static void chagneNumber(IntWrapper a, IntWrapper b) {
        
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        }
        else {
            a.value *= 2;
            b.value += 25;
        }

        return;
        
    }
}

class IntWrapper {
    int value;
    public IntWrapper(int value) {
        this.value = value;
    }
}