package code.with.play;

public class Increment {
	/*
	 * 前置・後置インクリメントをデバックして変数の中身を見る
	 */

	void test01() {

		int x = 0;
		int y = x + 1; // xが進んでから、yに代入される

		System.out.println("<前置インクリメント>");
		System.out.println("xは" + x);
		System.out.println("yは" + y);

	}

	void test02() {

		int x = 0;
		int y = x++; // yに元xが代入されてから、xが１つ進む

		System.out.println("<後置インクリメント>");
		System.out.println("xは" + x);
		System.out.println("yは" + y);
		System.out.println("");

	}

	void swap(String[] a, int index_a, int index_b) {

		String box = a[index_a];
		a[index_a] = a[index_b];
		a[index_b] = box;

		System.out.println("a[" + index_a + "]" + "==" + a[index_a]);
		System.out.println("a[" + index_b + "]" + "==" + a[index_b]);

	}

	public static void main(String[] args) {

		new Increment().test01();
		new Increment().test02();

		System.out.println("<パラメータ・タイミングの比較>");

		String[] a = { "FIVE", "one", "two", "three", "four" };
		int r1 = 0;
		int r2 = 1;
		System.out.println("①前置インクリメント");
		System.out.println("swap前のパラメータr1は : " + r1);
		System.out.println("swap前のパラメータr1は : " + r2);
		new Increment().swap(a, ++r1, ++r2);
		System.out.println("swap後のr1の変化 : " + r1);
		System.out.println("swap後のr2の変化 : " + r2);

		System.out.println("");

		String[] b = { "FIVE", "one", "two", "three", "four" };
		int i1 = 0;
		int i2 = 1;
		System.out.println("②後置インクリメント");
		System.out.println("swap前のパラメータi1は : " + i1);
		System.out.println("swap前のパラメータi1は : " + i2);
		Increment icm = new Increment();
		icm.swap(b, i1++, i2++);
		System.out.println("swap後のi1の変化 : " + i1);
		System.out.println("swap後のi2の変化 : " + i2);
		for (String is : b) {
			System.out.println(is + ". ");
		}
		System.out.println("/**/");

		/* 後置インクリメント、再帰の場合こうなる(oneとzeroは交換済み！) */
		for (int i = 0; i < 3; i++) {
			icm.swap(b, i1++, i2++);
			System.out.println("swap後のi1の変化 : " + i1);
			System.out.println("swap後のi2の変化 : " + i2);
			for (String is : b) {
				System.out.println(is + ". ");
			}
		}
	}
}
