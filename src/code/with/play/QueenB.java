package code.with.play;

/**
 * 2017/07/10.
 */
public class QueenB {

	static int[] pos = new int[8]; // 各列のqueenの配置(position)

	// 各列にqueenの位置を出力
	static void print() {
		for (int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		// outputs a decimal (integer) number that fills at least 2 character
		// spaces, padded with empty space.
		System.out.println();
	}

	// i列目にqueenを配置
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			pos[i] = j; // queenをj行に配置
			if (i == 7) // 全列に配置終了
				print();
			else
				set(i + 1); // 次の列
		}
	}

	public static void main(String[] args) {
		set(0);
	}
}
