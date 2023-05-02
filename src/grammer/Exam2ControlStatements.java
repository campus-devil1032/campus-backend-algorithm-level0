package grammer;

public class Exam2ControlStatements {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("아직 성인이 아닙니다.");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}