package problem.level1;

// �ܾ� ������
public class ReverseWords {
	public static void main(String[] args) {
		String str = "Hello, world!";
		String[] words = str.split(" "); // ������ �������� ���ڿ��� �����Ѵ�.

		for (int i = 0; i < words.length; i++) {
			char[] chars = words[i].toCharArray();
			for (int j = chars.length - 1; j >= 0; j--) {
				System.out.print(chars[j]);
			}
			System.out.print(" ");
		}
	}
}
