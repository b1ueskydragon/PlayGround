package programmer.se7.java;

import java.util.Date;

/**
 * 練習用 http://www.task-notes.com/entry/20151027/1445914800
 *
 * サブクラス
 */
public class InitializerSample extends SuperClass {
	static {
		System.out.println("サブクラスの" + STATIC_INIT + "の実行");
	}
	{
		Date date = new Date();
		System.out.println("サブクラスの" + OBJECT_INIT + "の実行");
	}

	public InitializerSample() {
		System.out.println("サブクラスのコンストラクタの実行");
	}

	public static void main(String[] args) {
		InitializerSample init = new InitializerSample();
		// newしない場合 -> スーパーもサブもsataic初期化のみになる
		System.out.println("mainメソッドの実行");
	}
}
