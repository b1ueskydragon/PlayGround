package graffiti;

public class ProcessBuilderTest {

	public static void main(String [] args) throws Exception {

		ProcessBuilder pb = new ProcessBuilder(
				"/実行したいファイルのパス/",
				"/書き込みたいtxtのファイル名/"
				);
		pb.start(); // 起動
	}
}
