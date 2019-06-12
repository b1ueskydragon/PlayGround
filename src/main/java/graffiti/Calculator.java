package graffiti;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	/*
	 * public Scanner(InputStream source)はコンストラクター、
	 * 一度しか実行されないので、ループしたい場合はループのなかに書いてあげること・・！
	 */

	double calculating(Scanner sc) {

		double result = 0;

		double x = 0;
		double y = 0;

		while (true) {
			try {
				sc = new Scanner(System.in);
				System.out.println("xを入力");
				x = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("入力し直してくださいー");
				continue;
			}
		}

		while (true) {
			try {
				sc = new Scanner(System.in);
				System.out.println("yを入力");
				y = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("入力し直してくださいー");
				continue;
			}
		}

		result = Math.round((x / y));

		sc.close();

		return result;
	}

	public static void main(String[] args) {

		System.out.println("割り算をもとめるためにわざわざ作ったの");
		Scanner sc = null;
		System.out.println(new Calculator().calculating(sc));

	}

}
