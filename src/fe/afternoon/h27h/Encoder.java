package fe.afternoon.h27h;

import java.util.HashMap;
import java.util.Map;

abstract public class Encoder {

	private Map<Character, String> conversionTable = new HashMap<>();

	protected void addConversion(char c, String s) {
		conversionTable.put(c, s);
	}

	protected void addNoConversion(char c) {
		conversionTable.put(c, String.valueOf(c));
	}

	protected void addNoConversion(char[] collection) {
		for (char c : collection) {
			addNoConversion(c);
		}
	}

	abstract protected String encode(char c);

	// encoding対象のstr sを受け付ける
	public String encoder(String s) {

		if (s == null)
			return null;

		String result = "";
		for (char c : s.toCharArray()) {
			String t = conversionTable.get(c);
			if (t == null) {
				t = encode(c); // abstractメソッドの方
			}
			result += t;
		}
		return result;
	}
}
