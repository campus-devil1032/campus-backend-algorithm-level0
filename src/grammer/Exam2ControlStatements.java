package grammer;

public class Exam2ControlStatements {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("�����Դϴ�.");
        } else {
            System.out.println("���� ������ �ƴմϴ�.");
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