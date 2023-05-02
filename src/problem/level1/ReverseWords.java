package problem.level1;

// 단어 뒤집기
public class ReverseWords {
	public static void main(String[] args) {
		String str = "Hello, world!";
		String[] words = str.split(" "); // 공백을 기준으로 문자열을 생성한다.

		for (int i = 0; i < words.length; i++) {
			char[] chars = words[i].toCharArray();
			for (int j = chars.length - 1; j >= 0; j--) {
				System.out.print(chars[j]);
			}
			System.out.print(" ");
		}
	}
}
