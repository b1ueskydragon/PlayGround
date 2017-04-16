package code.with.play;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 *
 * @author Inaa
 * JavaFX & Java8 プログラミング
 * 36-37ページ参考
 *
 * とても可愛い蛇さん
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
	boolean data [][] = new boolean[WIDTH][HEIGHT];
	int point = 0;
	Alert dlg = new Alert(AlertType.INFORMATION);



	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

	}



}
