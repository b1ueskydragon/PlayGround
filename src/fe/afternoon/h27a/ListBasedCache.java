package fe.afternoon.h27a;

import java.util.ArrayList;
import java.util.List;

// この子も抽象クラス
public abstract class ListBasedCache extends Cache {

	// Listで抽象クラスCacheの一部を実装
	final List<Entry> entries = new ArrayList<>();

	// キャッシュできるブロックデータの上限
	private static final int CACHE_SIZE = 20;

	// 抽象クラスCacheの同名のメソッドを実装
	byte[] getCachedBlockData(int index) {

		// 数で指定されたインデックスのブロックデータがキャッシュされていれば、それを返す
		for (Entry entry : entries) {
			if (entry.getIndex() == index) {
				hit(entry);
				return entry.getBlockData();
			}
		}
		// なければnull
		return null;
	}

	// 抽象クラスCacheの同名のメソッドを実装
	void cacheBlockData(int index, byte[] blockData) {

		// キャッシュできるブロックデータ数が上限に達した([0]~[19])場合
		// 管理方針に従って、「キャッシュされている」ブロックデータを削除
		// インデックスは新しいデータのインデックス！！
		if (entries.size() == CACHE_SIZE) {
			entries.remove(CACHE_SIZE - 1);
		}

		//
		// 0番目にEntryする
		// indexとblockDataをペアで考えたいのがEntry
		entries.add(0, new Entry(index, blockData));

	}

	// 要求されたデータがヒットした時呼び出される (キャッシュメモリに目的データがあった時..補助記憶じゃなくて、)。
	// 「見つかったブロックデータとインデックス値の対(キャッシュエントリ)」が引数。
	abstract void hit(Entry entry);

	private static class Entry {

		private final int index;
		private final byte[] blockData;

		// (コンストラクタ) 引数をもとに、「インデックスとブロックデータ」を持つキャッシュエントリ生成
		private Entry(int index, byte[] blockData) {
			this.index = index;
			this.blockData = blockData;
		}

		// getterでそれぞれ返す
		int getIndex() {
			return index;
		}

		byte[] getBlockData() {
			return blockData;
		}
	}

	// First In First Out
	// abstractのCacheを継承するのはできないので、具体化した小クラを継承。
	// Cacheをextendsするとそこのメソッドも実装しなければならない(orこのクラスも抽象化)。
	static class Fifo extends ListBasedCache {
		void hit(Entry entry) {
			// 無操作 //
		}
	}

	// Least Recently Used
	static class Lru extends ListBasedCache {
		void hit(Entry entry) {
			// 最近もっとも使われてないデータを捨てて
			entries.remove(entry);
			// 指定されたキャッシュエントリをListの先頭に格納
			// entryは「新しいデータ（とそのインデックス）」
			entries.add(0, entry);
		}
	}

}
