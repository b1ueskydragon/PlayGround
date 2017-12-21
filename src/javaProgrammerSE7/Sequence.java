package javaProgrammerSE7;

// Q1
public class Sequence {

	// コンストラクター -> インスタンスの初期化
	Sequence() {
		System.out.println("c ");
	}

	// 初期化ブロック <- 復数の初期化ブロックがある場合はコードに書かれた順に実行
	{
		System.out.println("y ");
	}

	public static void main(String[] args) {
		new Sequence().go();
		/*
		 * mainが呼ばれる時点で staticブロック
		 * newの時点(インスタンス生成時)で 初期化ブロック >> コンストラクター
		 * 最後にメソッド
		 */
	}

	void go() {
		System.out.println("g ");
	}

	// static ブロック -> クラスそのものの初期化  <- クラスロード時
	static {
		System.out.println("x ");
	}

}
