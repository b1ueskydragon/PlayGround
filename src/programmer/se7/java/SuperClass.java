package programmer.se7.java;

/**
 * 練習用 http://www.task-notes.com/entry/20151027/1445914800
 *
 * 初期化処理は次の順序で実行されます。
 * フィールド変数にデフォルト値代入
 * static初期化ブロックを上から順に実行
 * 初期化ブロックを上から順に実行
 * コンストラクタの呼び出し
 */
class SuperClass {
	public static final String STATIC_INIT = "static初期化ブロック";
	public static final String OBJECT_INIT = "初期化ブロック";
	static {
		System.out.println("スーパークラスの" + STATIC_INIT + "の実行");
	}
	{
		System.out.println("スーパークラスの" + OBJECT_INIT + "の実行");
	}

	public SuperClass() {
		System.out.println("スーパークラスのコンストラクタ実行");
	}
}
