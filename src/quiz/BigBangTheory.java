package quiz;

public class BigBangTheory {

	public static void main(String ... args) {
		Scientist scientist = new Sheldon() {
			// BigBangTheory.searchをオーバーライド
			public int search() {
				System.out.println("This is my new spot !");
				return 2;
			}
		};
		System.out.println(scientist.search());
	}

	interface Scientist {
		int search();
	}

	static class Sheldon implements Scientist {
		public int search() {
			System.out.println("This is my spot.");
			return 5;
		}
	}

}
