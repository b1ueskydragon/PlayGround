package code.with.play;

import java.util.function.Function;

public class LambdaPraAndFunction {

	public static void main(String [] args) {

		// <T,R> 引数Tを受け取り、結果Rを返す
		Function<String, String> obj = name -> "Hello " + name.toUpperCase();
		String str = obj.apply("inagon");
		System.out.println(str);

		// 遊んでみた
		Function<String, Integer> obj1 = name ->  name.length();
		int nameLen = obj1.apply("inagon");
		System.out.println("長さ " + nameLen);
	}

}
