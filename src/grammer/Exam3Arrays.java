package grammer;

// ������ �迭 (sta
public class Exam3Arrays {

	public static void main(String[] args) {
		int[] numbersByDynamic = { 1, 2, 3, 4, 5 }; // ���� �迭
		int[] numbersByStatic = new int[4];

		for (int i = 0; i < numbersByDynamic.length; i++) {
			System.out.println("�����迭 : " + numbersByDynamic[i]);
		}

		for (int i = 0; i < numbersByStatic.length; i++) {
			numbersByStatic[i] = i;
			System.out.println("�����迭 ���� ���� numbersByStatic[" + i + "] = " + i);
		}

		for (int i = 0; i < numbersByStatic.length; i++) {
			numbersByStatic[i] = i;
			System.out.println("�����迭 ���� ��� numbersByStatic[" + i + "] = " + i);
		}

		String[] names = { "John", "Jane", "Bob" };

		for (String name : names) {
			System.out.println(name);
		}
	}
}
