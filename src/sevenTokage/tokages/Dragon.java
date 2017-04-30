package sevenTokage.tokages;

import sevenTokage.attributes.Color;

/*
 * ドラゴンはトカゲの一種らしいです。
 * ま、とにかく、存在は一つで、とても具体的な生き物です。
 * 名前は「ちゃんドラゴン」です。
 *
 * インスタンス作れないようにしようかなー。特別だからw
 * でもそしたら実態も持てåないよなぁ
 *
 */
public class Dragon extends Tokage {
	private final static String name = "ちゃんドラゴン";
	private Color color = Color.LIGHTBLUE;

	public Dragon() {
		System.out.println(" |   |¥");
	}

	// 外部からゲットできる装置
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Color getColor() {
		return color;
	}

}
