package code.with.play;

public class ReferenceType {
	
	public static void main(String[] args) {

		/* 問1 */
		int[] a = new int[] { 1, 2, 3 };
		int[] b = a;
		b[0] = 5;
		
		System.out.println(a[0]);
		
		// a[0] = 5
		/*
		 *理由
		 *配列の変数は参照型なので、データではなく、先頭要素のアドレスが代入されるので、
		 *変数bと変数aはまったく同じ配列(オブジェクト)を参照しているから。
		 */

		/* 問2 */
		int c = 1;
		int d = c;
		d = 5;
		System.out.println(c);
		
		// c = 1
		/*
		 * 理由
		 * intは基本型なので、int変数には具体的なデータがそのまま代入されるから。
		 */

	}

}
