package code.with.play;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzFoo {
	/*
	 * 2017年3月2日作成, 速度改良・シンプル化必要？
	 */
	void fizzbuzz() {

		int i = 0;
		List<Integer> ary = new ArrayList<Integer>();

		// i = new Random().nextInt(30) + 1;
		// System.out.println(i);

		int index = 0;
		for (int r = 1; r <= 30; r++) {
			ary.add(r);

			i = ary.get(index);

			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("fizz, ");

			} else if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("buzz, ");
			} else if (i % 15 == 0) {
				System.out.println("fizzbuzz, ");
			} else {
				System.out.println("foo, ");
			}
			index++;
		}
	}

	public static void main(String[] args) throws Exception {
		new FizzBuzzFoo().fizzbuzz();
		System.out.println("やった!");
	}

}
