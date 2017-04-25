package code.with.play;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
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
	int dx = 2; // マークの進む量
	int dy = 0;
	
	boolean data[][] = new boolean[WIDTH][HEIGHT]; 
	// trueかfalseを保存する2次元配列 → すでにその座標に線画書かれているかどうかの情報を保存。 
	
	int point = 0;

	// ゲームオーバーの処理(ダイアログボックスを表示し終了)
	Alert dlg = new Alert(AlertType.INFORMATION);

	/*
	 * (非 Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 * startがメインメソッド
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
		// Sets the value of the property onKeyPressed.
		canvas.setOnKeyPressed(event -> onKeyPressed(event));
		canvas.setFocusTraversable(true); // デフォルトはfalse

		root.getChildren().add(canvas); // リストにadd

		stage.setScene(new Scene(root));
		stage.show(); // setting visibility to true

		// クライアント領域の幅と高さ
		ClientHeight = (int) stage.getScene().getHeight(); // 本来はdouble型
		ClientWidth = (int) stage.getScene().getWidth();

		// スタート座標
		cx = ClientWidth / 2;
		cy = ClientHeight / 2;

		/*
		 * java.utilのAPIとインナークラス
		 *
		 * バックグラウンド・スレッドで将来実行されるタスクをスケジュールする、スレッドのための機能です。
		 *
		 * while(true)を使うと、CPUが繰り返し処理に夢中になって、キー操作などができなくなるので、 代わりにTimerでタスク管理。
		 */
		Timer timer = new Timer();
		class GameTask extends TimerTask {

			private BooleanProperty gameover = new SimpleBooleanProperty(this, "gameover", false);

			public ReadOnlyBooleanProperty gameoverProperty() {
				return gameover;
			}

			/*
			 * gameoverの状態(プロパティ)のgetter/setter
			 * 
			 * Applicationクラスとは異なる他のクラスから直接Alterクラス(のダイアログボックス)を表示するのはできない。
			 * ↓
			 * TimerTaskクラスの中にgameoverという名のプロパティ作成、
			 * ゲームオーバー判定時にプロパティ値をfalseからtrueに変更。
			 * (Alertクラスの間接的な呼び出し)
			 */
			@SuppressWarnings("unused")
			public boolean isGameOver() {
				return gameover.get();
			}

			private void setGameover(boolean value) {
				gameover.set(value);
			}

			// TimerTaskのrun()をオーバーライド
			@Override
			public void run() {
				cx += dx;
				cy += dy;
				gc.fillRect(cx, cy, 2, 2);
				point += 1;

				if (isTheGameOver()) {
					Toolkit.getDefaultToolkit().beep();

					// 競合が起きないように
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							setGameover(true);
						}
					});

					this.cancel();
				}
				data[cx][cy] = true;
			}

			boolean isTheGameOver() {
				if (cx < 0)
					return true;
				if (cy < 0)
					return true;
				if (cx > ClientWidth)
					return true;
				if (cy > ClientHeight - 2)
					return true;
				if (data[cx][cy] == true)
					return true;

				return false;
			}
		}

		GameTask task = new GameTask();
		stage.setOnCloseRequest(

				event -> {
					if (task != null)
						task.cancel();
					if (timer != null)
						timer.cancel();
				}

		);
		timer.schedule(task, 1000, 100); // taskを1000ms後に実行して、100msごとにrun()実行。

		Toolkit.getDefaultToolkit().beep();

		task.gameoverProperty().addListener(

				// gameoverプロパティ値がfalseからtrueに変わったら、change()を呼び出してゲームオーバーの処理をする。
				new ChangeListener<Boolean>() {
					@Override
					public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
						if (task.gameoverProperty().get())
							gameOver();
					}

				}

		);

	}

	// キーが押された時の処理
	void onKeyPressed(KeyEvent event) {

		// KeyCodeは、Set of key codes for KeyEvent objects.
		if (event.getCode() == KeyCode.UP) {
			dx = 0;
			dy = -2;
		}
		if (event.getCode() == KeyCode.DOWN) {
			dx = 0;
			dy = 2;
		}
		if (event.getCode() == KeyCode.RIGHT) {
			dx = 2;
			dy = 0;
		}
		if (event.getCode() == KeyCode.LEFT) {
			dx = -2;
			dy = 0;
		}

	}

	// ゲームオーバー処理。
	// 直接Alertクラスを呼び出し。
	void gameOver() {

		dlg.setTitle("げーむおーばー");
		dlg.setHeaderText(String.format("お疲れ : 移動距離=%d", point));
		dlg.showAndWait();
		Platform.exit();
	}

	public static void main(String[] args) {

		new JFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application.launch(args);

	}

}
