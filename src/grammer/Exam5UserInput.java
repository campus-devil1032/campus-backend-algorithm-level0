package grammer;

import java.util.Scanner;

// �������� �Է¹ޱ�
public class Exam5UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�̸� �Է�: ");
		String name = scanner.nextLine();

		System.out.print("���� �Է�: ");
		int age = scanner.nextInt();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("�Է� ���� �̸�: " + name);
		System.out.println("�Է� ���� ����: " + age);

		scanner.close();
	}
}
