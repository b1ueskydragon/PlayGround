package quiz;

public class BigBangTheory {

	public static void main(String ... args) {
		Scientist scientist = new Sheldon() {
			public void search() {
				System.out.println("This is my new spot !");
			}
		};
		scientist.search();
	}

	interface Scientist {
		void search();
	}

	static class Sheldon implements Scientist {
		public void search() {
			System.out.println("This is my spot.");
		}
	}

}
