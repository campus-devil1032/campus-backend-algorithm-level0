package problem.level1;

public class MaxChar {
	public static void main(String[] args) {
		String str = "abcaabbc";
		char[] chars = str.toCharArray();

		int[] counts = new int[256];
		for (char c : chars) {
			// chars �迭�� ������� chars[0] ���� ������ ��ȸ�Ѵ�.
			// char ���ڰ� ascii �ڵ�� ǥ�� �Ǿ� �ִ� ���´�
			// �ƽ�Ű �ڵ�ǥ: https://www.ascii-code.com/
			counts[c]++;
		}

		int maxCount = 0;
		char maxChar = 0;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > maxCount) {
				maxCount = counts[i];
				maxChar = (char) i;
			}
		}
		System.out.println("Max char: " + maxChar);
	}
}
