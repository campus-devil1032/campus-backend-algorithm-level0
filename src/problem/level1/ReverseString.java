package problem.level1;

// 문자열 거꾸로 출력하기
public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello, world!";
		char[] chars = str.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
	}
}
