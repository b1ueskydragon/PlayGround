package sevenTokage.tokages;

import java.util.NoSuchElementException;
import java.util.Scanner;

import sevenTokage.attributes.Color;

/*
 * 虹色トカゲ。
 * ７つの色を持つ万能なトカゲ。でもテキトーに混ざっている。
 * ちょっと特別なトカゲ。
 */
public class NijiiroTokage extends Tokage {

	public NijiiroTokage() {
		System.out.println(" |   |7");
	}

	Scanner sc = null;

	public Color setNumGetColor() {

		int thisOne = 0;
		System.out.println("「0から10まで、今日は何番の気分?」");
		thisOne = inputNum(thisOne);

		return colorList.get(thisOne);
	}

	private int inputNum(int thisOne) {

		while (true) {
			try {
				sc = new Scanner(System.in);
				thisOne = sc.nextInt();

				if (thisOne <= colorList.size())
					break;
				else {
					System.out.println("List Size超えてるわ");
					continue;
				}
			} catch (NoSuchElementException e) {
				System.out.print("おこ--");
				continue;
			}
		}

		sc.close();

		return thisOne;
	}

}
