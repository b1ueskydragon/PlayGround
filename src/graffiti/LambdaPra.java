package graffiti;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * (実装するメソッドの引数)
 * 型推論による型の省略可能
 * 引数が1つの場合のみ()省略可能 (ない場合は省略できない)
 *
 *  -> {処理};
 * 処理が1文の場合{}とreturn省略可能
 */
public class LambdaPra {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("crocodile", "dragon");

		// 匿名クラスによる実装 (再利用することがないクラス)
		words.replaceAll(new UnaryOperator<String>(){
			public String apply(String str) {
				return str.toUpperCase();
			}
		});
		// 省略なしのラムダ式
		words.replaceAll((String str) -> {return str.toUpperCase();});

		// きれいきれいなラムダ式
		words.replaceAll(str -> str.toUpperCase());

		System.out.println(words);

	}

}
