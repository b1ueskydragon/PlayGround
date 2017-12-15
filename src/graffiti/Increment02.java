package graffiti;

public class Increment02 {

	void swap02(String[] a, int index_a, int index_b) {

		String box = a[index_a];
		a[index_a] = a[index_b];
		a[index_b] = box;

		System.out.println("a[" + index_a + "]" + "==" + a[index_a]);
		System.out.println("a[" + index_b + "]" + "==" + a[index_b]);

	}

	public static void main(String[] args) {

		/* パラメータを手動(?)でインクリメントさせる */

		Increment02 icm = new Increment02();

		String[] a = { "FIVE", "one", "two", "three", "four" };
		int index_a = 0;
		int index_b = 1;

		while (true) {

			icm.swap02(a, index_a, index_b);
			index_a += 1;
			index_b += 1;

			if (a[4].equals("FIVE")) {
				for (String s : a) {
					System.out.println(s + ". ");
				}
				break;
			}

		}

		System.out.println(System.getProperty("line.separator"));

		/* 同じ結果(前もって後置インクリメントをパラメータで渡しちゃった) */

		Increment02 icm2 = new Increment02();

		String[] aa = { "FIVE", "one", "two", "three", "four" };
		int index_aa = 0;
		int index_bb = 1;

		while (true) {

			icm2.swap02(aa, index_aa++, index_bb++);

			if (aa[4].equals("FIVE")) {
				for (String s : a) {
					System.out.println(s + ". ");
				}
				break;
			}

		}

	}
	
	/* 結論。
	 * 
	 * y = ++x;    // y = (x += 1); と同じ
	 * y = x++;    // y = x; x = x + 1; と同じ
	 * 
	 */

}
