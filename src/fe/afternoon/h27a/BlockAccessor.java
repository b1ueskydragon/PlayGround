package fe.afternoon.h27a;

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
