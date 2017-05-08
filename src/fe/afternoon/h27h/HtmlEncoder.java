package fe.afternoon.h27h;

public class HtmlEncoder extends Encoder {

	private static String ALPAHS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String NUMERIC = "0123456789";
	private static String PUNCTUATIONS = "!#$%()*+,-.:;=?@[//]^_`{|}~";

	// コンストラクター・・！ (newすると必ず最初の一回実行される)
	public HtmlEncoder() {
		addNoConversion(ALPAHS.toCharArray());
		addNoConversion(ALPAHS.toLowerCase().toCharArray());
		addNoConversion(NUMERIC.toCharArray());
		addNoConversion(PUNCTUATIONS.toCharArray());

		addConversion('<', "&lt;");
		addConversion('>', "&rt;");
		addConversion('&', "&amp;");
		addConversion('"', "&quot;");
	}

	@Override
	protected String encode(char c) {
		return "&#" + (int) c + ";";
	}

}
