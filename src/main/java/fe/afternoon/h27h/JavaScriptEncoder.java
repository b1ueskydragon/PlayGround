package fe.afternoon.h27h;

public class JavaScriptEncoder extends Encoder {

	private static String ALPAHS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String NUMERIC = "0123456789";

	public JavaScriptEncoder() {
		addNoConversion(ALPAHS.toCharArray());
		addNoConversion(ALPAHS.toLowerCase().toCharArray());
		addNoConversion(NUMERIC.toCharArray());
	}

	@Override
	protected String encode(char c) {

		if(c<256){
			return String.format("\\x%02X", (int)c);
		}
		return String.format("\\u%04X", (int)c);
	}

}
