package sevenTokage.tokages;

import java.util.ArrayList;
import java.util.List;

import sevenTokage.attributes.Color;
import sevenTokage.attributes.Element;

/*
 * トカゲというモノがあるらしいよ・・・(ざわざわ)
 * よくわかんないけどね。
 */
public abstract class Tokage {

	String name;
	Color color;
	Element element;
	List<Color> colorList = new ArrayList<>();

	public Tokage() {
		System.out.println(" /|_/|");
		System.out.println("(・・ )");
	}

	public List<Color> getColorList() {

		colorList.add(Color.RED);
		colorList.add(Color.ORANGE);
		colorList.add(Color.YELLOW);
		colorList.add(Color.GREEN);
		colorList.add(Color.BLUE);
		colorList.add(Color.DARKBLUE);
		colorList.add(Color.PURPLE);
		colorList.add(Color.LIGHTBLUE);
		colorList.add(Color.BLACK);
		colorList.add(Color.WHITE);

		return colorList;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public Element getElement() {
		return element;
	}

}
