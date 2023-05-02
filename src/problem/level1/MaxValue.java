package problem.level1;

// ÃÖ´ñ°ª Ã£±â
public class MaxValue {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 7, 3 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Max value: " + max);
	}
}
