package sevenTokage.attributes;

import java.util.ArrayList;
import java.util.List;

public enum Color {

	RED, ORANGE, YELLOW, GREEN, BLUE, DARKBLUE, PURPLE, LIGHTBLUE, BLACK, WHITE;

	public List<Color> colorList() {

		List<Color> colorList = new ArrayList<>();

		colorList.add(RED);
		colorList.add(ORANGE);
		colorList.add(YELLOW);
		colorList.add(GREEN);
		colorList.add(BLUE);
		colorList.add(DARKBLUE);
		colorList.add(PURPLE);
		colorList.add(LIGHTBLUE);
		colorList.add(BLACK);
		colorList.add(WHITE);

		return colorList;

	}

	public Color getRed(){
		return Color.RED;
	}

	public Color getLightBlue(){
		return Color.LIGHTBLUE;
	}

}
