package letters;

public class WorkHere {

	WordModel model1 = new WordModel(new WordFactory().factory());
	WordModel model2 = new WordModel(new WordFactory().factory2());

	public static void main(String[] args) {
		System.out.println("coding on " + System.getProperty("os.name") + ", java Ver "
				+ System.getProperty("java.version") + ", coding by : Inaaa" + System.getProperty("line.separator"));

		new WorkHere().mainWork();
		System.out.println(System.getProperty("line.separator") + "今日はここまで！");
	}

	void mainWork() {
		String putHere = "";
		for (String s : new WorkHere().model1.getWords())
			putHere += s + " ";
		System.out.println(putHere.trim().substring(0, putHere.length() - 2));

		if (!(putHere == null))
			System.out.print(System.getProperty("line.separator"));

		String putHere2 = "";
		for (String s : new WorkHere().model2.getWords())
			putHere2 += s + " ";
		System.out.println(putHere2.trim().substring(0, putHere2.length() - 2));

		if (!(putHere == null || putHere2 == null))
			WordFactory.hello();
	}
}