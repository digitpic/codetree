import java.util.Scanner;

class IntWrapper {

    int value;

    public IntWrapper(int value) {

        this.value = value;

    }        

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);

        modifyNumber(aWrapper, bWrapper);

        a = aWrapper.value;
        b = bWrapper.value;

        System.out.println(a + " " + b);

    }

    public static void modifyNumber(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        }
        else {
            b.value *= 2;
            a.value += 10;
        }
        return;
    }

}