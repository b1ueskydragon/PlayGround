package fe.afternoon.h27a;

class BlockDevice {

	private final byte[][] blocks = new byte[100][512];

	// コンストラクター
	static BlockDevice open(){
		return new BlockDevice();
	}

	int getBlockSize(){
		return blocks[0].length;
	}

	void readBlock(int index, byte[] buffer){
		// インデックス指定して読み込んだデータを、下のパッファに読み込む
		byte [] block = blocks[index];

		// 転送先配列の指定位置に配列をコピーします。
		System.arraycopy(block, 0, buffer, 0, block.length);
	}
}
