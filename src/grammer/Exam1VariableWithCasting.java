package grammer;

public class Exam1VariableWithCasting {
	public static void main(String[] args) {
		int thisIsIntVariable = 1000;
		long thisIsLongTypeVariable = thisIsIntVariable;
		System.out.println("int ��: " + thisIsIntVariable + " long ��: " + thisIsLongTypeVariable);

		thisIsLongTypeVariable = 123456789123456789L;
		int fromLongToInt = (int) thisIsLongTypeVariable;
		System.out.println("fromLongToInt ��: " + fromLongToInt); // -1395630315 (8byte ���� 4byte�� �־ ���������� ���� ���Դ�.)
		System.out.println("thisIsLongTypeVariable ������ ��: 			" + Long.toBinaryString(thisIsLongTypeVariable));
		System.out.println("fromLongToInt ������ ��: 			 " + Long.toBinaryString(fromLongToInt)); // //
		// 8byte ���� 4byte�� �־ ���������� ���� ���Դ�.

		/**
		 * fromLongToInt ������ ��:  	         1111111111111111111111111111111110101100110100000101111100010101
		 * thisIsLongTypeVariable ������ ��: 			110110110100110110100101110101100110100000101111100010101
		 * 
		 */
	}
}
 