import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] pArr = new Person[3];
        String[] result = new String[3];
        int count = 0;

        for (int i = 0; i < 3; i++){
            pArr[i] = new Person(sc.next(), sc.nextInt());
        }
        
        for (int i = 0; i < 3; i++) {
            // 유증상, 37도 이상 A
            if (pArr[i].getSymp() && (pArr[i].getTemp() >= 37) ) {
                result[i] = "A";
            }
            // 무증상, 37도 이상 B
            else if (!pArr[i].getSymp() && (pArr[i].getTemp() >= 37) ) {
                result[i] = "B";
            }
            // 유증상, 37도 미만 C
            else if (pArr[i].getSymp() && (pArr[i].getTemp() < 37) ) {
                result[i] = "C";
            }
            // 무증상, 37도 미만 D
            else if (!pArr[i].getSymp() && pArr[i].getTemp() < 37) {
                result[i] = "D";
            }
        }

        for (int i = 0; i < 3; i++){
            if (result[i].equals("A")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("E");
        }
        else {
            System.out.println("N");
        }

    }
}

class Person {
    
        private boolean symp;
        private int temp;

        public Person(String symp, int temp){
            this.symp = symp.equals("Y");
            this.temp = temp;
        }

        public boolean getSymp(){
            return this.symp;
        }

        public int getTemp(){
            return this.temp;
        }

    }