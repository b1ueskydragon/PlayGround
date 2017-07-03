package playplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintLine {

	List<String> sophomore;
	List<String> kaomoji;

	public List<String> yours() {

		sophomore = new ArrayList<>();

		sophomore.add("むぎ");
		sophomore.add("でん");
		sophomore.add("みよ");
		sophomore.add("ひなの");
		sophomore.add("えってぃ");
		sophomore.add("らむ");
		sophomore.add("りさ");
		sophomore.add("ことか");
		sophomore.add("まこ");
		sophomore.add("ゆい");

		return sophomore;
	}

	public List<String> kaomoji() {

		kaomoji = new ArrayList<>();

		kaomoji.add(" (｀ω｀)");
		kaomoji.add(" (・v・)");
		kaomoji.add(" ('v ')");
		kaomoji.add(" (・0・)");
		kaomoji.add(" (・+・)");
		kaomoji.add(" (` A`)");
		kaomoji.add(" (・_・)");
		kaomoji.add(" (・^・)");
		kaomoji.add(" (・A・)");
		kaomoji.add(" (・8・)");

		return kaomoji;
	}

	public void printLine(int i) throws InterruptedException {

		List<String> kaomoji = kaomoji();
		List<String> sophomore = yours();

		System.out.println("  /|_/|");
		System.out.println(kaomoji.get(i) + sophomore.get(i));
		System.out.println(" |o   |o");
		System.out.println();
		Thread.sleep(500);

	}

	public void printLine2(int i) throws InterruptedException {
		List<String> kaomoji = kaomoji();
		List<String> sophomore = yours();

		System.out.println("   " + "  /|_/|");
		System.out.println("   " + kaomoji.get(i) + sophomore.get(i));
		System.out.println("   " + " d|  d|");
		System.out.println();
		Thread.sleep(500);

	}

	public void printLineFinal() throws InterruptedException {

//		String space = "   ";
		String space = "---";


		for (int r = 0; r < 5; r++) {

			for (int i = 0; i < 5 + r; i++) {
				System.out.print(space);
			}
			System.out.println(space + "  /|_/|");

			for (int i = 0; i < 5 + r; i++) {
				System.out.print(space);
			}
			System.out.println(space + " (`w` )");

			for (int i = 0; i < 5 + r; i++) {
				System.out.print(space);
			}
			System.out.println(space + " d|  d|");

			System.out.println();
			Thread.sleep(300);

		}

	}

	public void printlnFst() throws InterruptedException {
		System.out.println();
		System.out.println();
		System.out.println("あっ、");
		Thread.sleep(400);
		System.out.println("それは、");
		Thread.sleep(400);
		System.out.println("あすなろ、" + System.getProperty("line.separator"));
		Thread.sleep(300);
		System.out.println("!!");
		System.out.println();
	}

	public void printlnSnd() throws InterruptedException {
		System.out.println("  /| _/|" + " zzz..");
		System.out.println(" (-.  -)" + "....");
		System.out.println(" /ちゃん|" + "....");
		Thread.sleep(1000);
		System.out.println();
		System.out.println("......................");
		System.out.println();
		Thread.sleep(2000);
		System.out.println("  /| _/|" + " ...!");
		System.out.println(" (!   !)" + "....");
		System.out.println(" /ちゃん|" + "....");
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		Thread.sleep(500);
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println();
		}

		PrintLine pl = new PrintLine();

		try {
			pl.printlnSnd();
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		}

		System.out.println("  /|_/|" + " ← 居眠りしてた");
		System.out.println(" (・ ・)" + "今日の..日付は...");
		System.out.println(" |ちゃん|" + "    ");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		sc.close();

		try {
			pl.printlnFst();

			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0)
					pl.printLine(i);
				else
					pl.printLine2(i);
			}
			pl.printLineFinal();
			System.out.println("                                  ファイト、");
			System.out.println("                                      あすなろ！！");

			String space = "   ";
		//	String space = "---";

			for (int i = 0; i < 3; i++) {
				System.out.print(space);
			}
			System.out.println(space + "  /|_/|");

			for (int i = 0; i < 3; i++) {
				System.out.print(space);
			}
			System.out.println(space + " (`w` )" + "...!");

			for (int i = 0; i < 3; i++) {
				System.out.print(space);
			}
			System.out.println(space + " d|  d|");

			System.out.println();
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
