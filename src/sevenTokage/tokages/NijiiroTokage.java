package sevenTokage.tokages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import sevenTokage.attributes.Color;

/*
 * 虹色トカゲ。
 * ７つの色を持つ万能なトカゲ。でもテキトーに混ざっている。
 * ちょっと特別なトカゲ。
 */
public abstract class NijiiroTokage extends Tokage {

	List<Color> colorList = color.colorList();
	Scanner sc = null;

	public int inputInt() {

		System.out.println("0から10まで、今日は何番の気分?");
		int thisOne = 0;

		while (true) {
			try {
				sc = new Scanner(System.in);
				thisOne = sc.nextInt();
				if (thisOne <= colorList.size())
					break;
				else{
					System.out.print("List Size超えてるわ");
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

	public void setNumGetColor(int i) {
		colorList.get(i);
	}

}
