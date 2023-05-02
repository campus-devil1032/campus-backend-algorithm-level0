package problem.level1;

public class MaxChar {
	public static void main(String[] args) {
		String str = "abcaabbc";
		char[] chars = str.toCharArray();

		int[] counts = new int[256];
		for (char c : chars) {
			// chars 배열을 순서대로 chars[0] 부터 끝까지 순회한다.
			// char 문자가 ascii 코드로 표현 되어 있는 상태다
			// 아스키 코드표: https://www.ascii-code.com/
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
