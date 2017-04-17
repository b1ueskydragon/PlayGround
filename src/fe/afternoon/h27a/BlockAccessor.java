package fe.afternoon.h27a;

/*
 * プロックデバイスからの「読み取りだけ」を考えるプログラム
 *
 * アプリから要求されたブロックデータを
 * プロックデバイスから取り出して、アプリに渡す。
 * アクセッサはキャッシュを利用し、取得したデータをキャッシュする。
 * 要求されたデータがキャッシュにあれば、キャッシュから持ってくる。
 *
 * キャッシュにはFIFO、LRU、２つの方針を用意し、どの実装を利用するかはアプリが指定する。
 */
public class BlockAccessor {

	private final Cache cache;
	private final BlockDevice device;

	// コンストラクター(初期化)
	// BlockDeviceをオープンし、Cache生成。
	// policyはCacheクラスのENUM
	public BlockAccessor(Cache.Policy policy){
		device = BlockDevice.open();
		cache = Cache.createCache(policy);
	}

	public byte[] readBlock(int index){

		byte [] blockData = cache.getCachedBlockData(index);

		if(blockData == null){
			blockData = new byte [device.getBlockSize()];
			device.readBlock(index, blockData);
			cache.cacheBlockData(index, blockData);
		}

		return blockData.clone();
	}

}
