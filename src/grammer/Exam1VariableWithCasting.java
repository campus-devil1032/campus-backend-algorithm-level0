package grammer;

public class Exam1VariableWithCasting {
	public static void main(String[] args) {
		int thisIsIntVariable = 1000;
		long thisIsLongTypeVariable = thisIsIntVariable;
		System.out.println("int 값: " + thisIsIntVariable + " long 값: " + thisIsLongTypeVariable);

		thisIsLongTypeVariable = 123456789123456789L;
		int fromLongToInt = (int) thisIsLongTypeVariable;
		System.out.println("fromLongToInt 값: " + fromLongToInt); // -1395630315 (8byte 값을 4byte에 넣어서 비정상적인 값이 나왔다.)
		System.out.println("thisIsLongTypeVariable 이진수 값: 			" + Long.toBinaryString(thisIsLongTypeVariable));
		System.out.println("fromLongToInt 이진수 값: 			 " + Long.toBinaryString(fromLongToInt)); // //
		// 8byte 값을 4byte에 넣어서 비정상적인 값이 나왔다.

		/**
		 * fromLongToInt 이진수 값:  	         1111111111111111111111111111111110101100110100000101111100010101
		 * thisIsLongTypeVariable 이진수 값: 			110110110100110110100101110101100110100000101111100010101
		 * 
		 */
	}
}
 