package letters.demo;

/**
 *
 * @author inaa
 *
 * ShelScriptに打ち込む前にロジックテスト
 */
public class Tset {
	public static void main(String[] args) {

//		int i = 0;
//		while (i < 7) {
//			System.out.println("File[" + i++ + "]" + "を圧縮して送るよ");
//
//			if (i == 7) {
//				i = 0;
//				System.out.println("#月曜日になりました！");
//				System.out.println("File[" + i++ + "]" + "を圧縮して送るよ");
//			}
//
//		}




		for(int r = 0; r <7 ; r ++) {
			System.out.println("File[" + r + "]" + "を圧縮して送るよ");

			if (r == 6) {
				r = 0;
				System.out.println("#月曜日になりました！");
				System.out.println("File[" + r + "]" + "を圧縮して送るよ");

			}

		}




	}

}
