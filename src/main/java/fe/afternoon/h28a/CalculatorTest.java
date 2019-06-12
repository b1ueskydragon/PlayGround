package fe.afternoon.h28a;

import java.util.HashMap;
import java.util.Map;

public class CalculatorTest {

	// <Q>
	// https://www.jitec.ipa.go.jp/1_04hanni_sukiru/mondai_kaitou_2016h28_2/2016h28a_fe_pm_qs.pdf
	// <A>
	// https://www.jitec.ipa.go.jp/1_04hanni_sukiru/mondai_kaitou_2016h28_2/2016h28a_fe_pm_ans.pdf

	public static void main(String[] args) {

		Map <Character, Key> map = new HashMap<>();
		// 文字と列挙OperationKeyの定数の対応をmapに格納する。

		for (OperationKey key : OperationKey.values())
			map.put("+-*/=C".charAt(key.ordinal()), key);
		// 数字と列挙DigitKeyの定数の対応をmapに格納する。

		for(DigitKey key : DigitKey.values())
			map.put("0123456789".charAt(key.ordinal()), key);

		Calculator calc = new Calculator();
		String chars = args[0]; 
		// 引数ないと、args[0]が存在しなくなるのでArrayIndexOutOfBoundsException (実行の構成で引数指定、mainで実行する)
		// charsの各文字をキーの定数に変換し、メソッドonKeyPressedを呼び出す。

		for(int i = 0; i < chars.length(); i++){
			calc.onKeyPressed(map.get(chars.charAt(i)));
		}

	}

}