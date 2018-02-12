package _past.tokage;

import _past.tokage.logics.DateService;
import _past.tokage.logics.DrawingTools;
import _past.tokage.tokages.Dragon;
import _past.tokage.tokages.NijiiroTokage;

/**
 *
 * @author ちゃん (Inaa)
 *
 */
/*
 * トカゲたちが実際振る舞うトコロ
 */
public class TheMain {
	public static void main(String[] args) {

		DrawingTools tools = new DrawingTools();

		// Dragon Test
		Dragon dragon = new Dragon();
		System.out.println(dragon.getName());
		tools.waitPlease();
		System.out.println(dragon.getColor());

		// tools
		System.out.println();
		tools.waitPlease();
		tools.drawingBar();
		tools.waitPlease();
		System.out.println();
		tools.drawingBar();
		tools.waitPlease();
		System.out.println();
		System.out.println();
		tools.waitPlease();

		// Niji Test
		NijiiroTokage niji = new NijiiroTokage();
		niji.setName("にじいろトカゲ");
		tools.waitPlease();
		System.out.println(niji.getName() + " からの質問、");
		tools.waitPlease();
		niji.setNumGetColor();

		// tools
		tools.drawingBar();
		tools.waitPlease();
		System.out.println();
		System.out.print("   ");
		tools.drawingBar();
		tools.waitPlease();
		System.out.println();
		System.out.print("   " + "   ");
		tools.drawingBar();
		tools.waitPlease();
		System.out.println();

		System.out.print("   " + "   " + "   ");
		System.out.println("じゃ、" + niji.getColor() + "にする。");

		System.out.println();

		DateService dates = new DateService();
		dates.whatTimeIsIt();

	}

}
