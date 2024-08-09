import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] studentArr = new Student[n];
        for (int i=0; i<n; i++)
            studentArr[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        Arrays.sort(studentArr);

        for (int i=0; i<n; i++)
            System.out.println(studentArr[i].toString());

    }
}

class Student implements Comparable<Student>{
    int h;
    int w;
    int number;

    public Student(int h, int w, int number) {
        this.h = h;
        this.w = w;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if (this.h == student.h) {
            return student.w - this.w;
        }
        return this.h - student.h;
    }

    @Override
    public String toString() {
        return this.h + " " + this.w + " " + this.number;
    }

}