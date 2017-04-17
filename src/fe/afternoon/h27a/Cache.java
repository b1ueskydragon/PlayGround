package fe.afternoon.h27a;

public abstract class Cache {

	public enum Policy{
		FIFO, LIRU
	}


	static Cache createCache(Policy policy){
		switch(policy){
		case FIFO:
			return new ListBasedCache.Fifo();
		case LIRU:
			return new ListBasedCache.Lru();
		}
		throw new UnsupportedOperationException();
	}


	// 抽象メソッド
	// 引数で指定されたインデックスのブロックデータがキャッシュされていれば、それを返す
	// なければnull。
	abstract byte[] getCachedBlockData(int index);

	// 引数で指定されたインデックス、そのインデックスのブロックデータをキャッシュする。
	// キャッシュできるブロックデータ数が上限に達した場合、
	// 管理方針に従っャッシュされているブロックデータを削除、新しいデータをキャッシュ。
	abstract void cacheBlockData(int index, byte[] blockData);
}
