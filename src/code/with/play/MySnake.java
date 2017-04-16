package code.with.play;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Inaa JavaFX & Java8 プログラミング 36-37ページ参考
 *
 *         とても可愛い蛇さん
 */
/*
 * Java8からはJavaFxが含まれて要るが、 install softwareにてe(fx)clipseのインストール必要
 */
public class MySnake extends Application {

	final int WIDTH = 280;
	final int HEIGHT = 241;
	int ClientWidth = WIDTH;
	int ClientHeight = HEIGHT;

	int cx = 0; // マークの座標
	int cy = 0;
	int dx = 0; // マークの進む量
	int dy = 0;
	boolean data[][] = new boolean[WIDTH][HEIGHT];
	int point = 0;
	Alert dlg = new Alert(AlertType.INFORMATION);

	/*
	 * (非 Javadoc)
	 *
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 *
	 * 外側
	 */
	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		stage.setTitle("ちゃん蛇");
		stage.setWidth(WIDTH);
		stage.setHeight(HEIGHT);
		stage.initStyle(StageStyle.UTILITY);
		stage.centerOnScreen();
		stage.setResizable(false); // デフォルトはtrue

		Group root = new Group();

		final Canvas canvas = new Canvas(WIDTH, HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// onKeyPressedメソッドはこのクラス内に記載
		canvas.setOnKeyPressed(event -> onKeyPressed(event)); // Sets the value
																// of the
																// property
																// onKeyPressed.
		canvas.setFocusTraversable(true); // デフォルトはfalse

		root.getChildren().add(canvas); // リストにadd

		stage.setScene(new Scene(root));
		stage.show(); // setting visibility to true

	}

	// キーが押された時の処理
	void onKeyPressed(KeyEvent event) {

	}

	// ゲームオーバー対応
	void gameOver() {

	}

}
