package grammer;

import java.util.Scanner;

// 유저에게 입력받기
public class Exam5UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름 입력: ");
		String name = scanner.nextLine();

		System.out.print("나이 입력: ");
		int age = scanner.nextInt();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("입력 받은 이름: " + name);
		System.out.println("입력 받은 나이: " + age);

		scanner.close();
	}
}
