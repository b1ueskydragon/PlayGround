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
		System.out.println("「1から10まで、今日は何番の気分?」");
		thisOne = inputNum(thisOne);

		this.color = colorList.get(thisOne);

		return color;
	}

	private int inputNum(int thisOne) {

		while (true) {
			try {
				sc = new Scanner(System.in);
				thisOne = sc.nextInt() - 1;

				if (thisOne <= getColorList().size() - 1 && thisOne >= 0)
					break;
				else {
					System.out.println("List Size超えてるわ");
					continue;
				}
			} catch (NoSuchElementException | IndexOutOfBoundsException e) {
				System.out.print("おこ--");
				continue;
			}
		}

		sc.close();

		return thisOne;
	}

}
