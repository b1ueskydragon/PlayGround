package word.to.code;

import java.util.List;

public class WordModel {

	private List<String> words;

	// コンストラクター
	WordModel(List<String> words) {
		this.words = words;
	}

	public List<String> getWords() {
		return words;
	}

}