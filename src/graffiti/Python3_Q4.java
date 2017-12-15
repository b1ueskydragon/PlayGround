package graffiti;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ijrd1 Python3で書けと言われたがJavaで書いちゃった意地悪い子です。 ひらめき次第書いたのできれいきれいではないかも？
 */
public class Python3_Q4 {

	String comma = ". ";
	List<Integer> sample = new ArrayList<>();

	void math() {

		for (int i = 1; i < 31; i++) {
			sample.add(i);
			System.out.print(i + comma);
		}
		sample = null;
	}

	void adding() {

		int result = 0;
		int index = 0;
		for (int i = 1; i < 31; i++) {
			sample.add(i);
			result += sample.get(index);
			index++;
		}
		System.out.print(result);
		sample = null;
	}

	void oddNum() {

		for (int i = 1; i < 31; i++) {
			sample.add(i);
		}
		for (Integer i : sample) {
			if (i % 2 == 0) {
				System.out.print(i + comma);
			}
		}
		sample = null;
	}

	void threeNum() {

		for (int i = 1; i < 51; i++) {
			sample.add(i);
		}
		System.out.print("・3の倍数 : ");
		for (Integer i : sample) {
			if (i % 3 == 0) {
				System.out.print(i + comma);
			}
		}
		System.out.println("");
		System.out.print("・3がつく : ");
		for (Integer i : sample) {
			String strNum = i.toString();
			if (strNum.contains("3")) {
				System.out.print(Integer.parseInt(strNum) + comma);
			}
		}
		sample = null;
	}

	public static void main(String[] args) {

		System.out.println("①1から30までの数字を表示する");
		new Python3_Q4().math();
		System.out.println(System.getProperty("line.separator"));

		System.out.println("②1から30までの数字をすべて足し込んだ値を計算して表示する");
		new Python3_Q4().adding();
		System.out.println(System.getProperty("line.separator"));

		System.out.println("③1から30までの数字のうち、偶数のみを表示する");
		new Python3_Q4().oddNum();
		System.out.println(System.getProperty("line.separator"));

		System.out.println("④1から50までの数字のうち、3の倍数と3がつく数字のみを表示する");
		new Python3_Q4().threeNum();

	}

}
