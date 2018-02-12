package _past.tokage.logics;

public class DrawingTools {

	public void drawingBar() {

		String bar = "...";
		System.out.print(bar);

	}

	public void waitPlease() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
