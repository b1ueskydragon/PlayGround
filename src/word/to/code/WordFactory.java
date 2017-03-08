package word.to.code;

import java.util.ArrayList;
import java.util.List;

public class WordFactory {

	final static void hello() {
		System.out.println(System.getProperty("line.separator") + "＞笑顔(^ω^)");
	}

	public List<String> factory() {
		List<String> wordList = new ArrayList<>();
		wordList.add("＞今日はどんな");
		wordList.add("1日でしたか？" + System.getProperty("line.separator"));
		return wordList;
	}

	public List<String> factory2() {
		List<String> wordList2 = new ArrayList<>();
		wordList2.add("＞明日も元気で");
		wordList2.add("いられますように" + System.getProperty("line.separator"));
		return wordList2;
	}
}