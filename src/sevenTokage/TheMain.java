package sevenTokage;

import sevenTokage.tokages.Dragon;
import sevenTokage.tokages.NijiiroTokage;

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

		// Dragon Test
		Dragon dragon = new Dragon();
		System.out.println(dragon.getName());
		System.out.println(dragon.getColor());

		System.out.println();

		// Niji Test
		NijiiroTokage niji = new NijiiroTokage();
		niji.setName("にじいろトカゲ");
		System.out.println(niji.getName() + " からの質問、");
		niji.setNumGetColor();
		System.out.println("じゃ、" + niji.getColor()+"にする。");

		System.out.println();

		//Sample



	}

}
