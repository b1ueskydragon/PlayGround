package graffiti;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.awt.Toolkit;
import java.time.Instant;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MoveBall extends Application {

  private int cxBlack = 0; // マークの座標
  private int cyBlack = 0;
  private int cxGray = 0; // マークの座標
  private int cyGray = 0;
  private int dxBlack = 2; // マークの進む量
  private int dyBlack = 0;
  private int dxGray = 2; // マークの進む量
  private int dyGray = 0;
  private TimerTask task = null;
  private Timer grayTimer = null;
  private Timeline blackTimer = null;

  @Override
  public void start(Stage stage) throws Exception {

    stage.setTitle("MoveBall");
    stage.initStyle(StageStyle.UTILITY);

    Circle blackBall = new Circle(140, 120, 20, Color.BLACK);
    Circle grayBall = new Circle(240, 120, 20, Color.GRAY);

    // 乱数を初期化する
    Random rnd = new Random(Instant.now().getNano());

    cxBlack = (int) blackBall.getLayoutX();
    cyBlack = (int) blackBall.getLayoutY();

    blackTimer = new Timeline(
        new KeyFrame(Duration.millis(500), // 第二パラメータはイベントハンドラー
            event -> { // 繰り返しのアクションイベントを書く
              // ボールを移動する
              dxBlack = rnd.nextInt(20) - 10;
              dyBlack = rnd.nextInt(20) - 10;
              cxBlack = cxBlack + dxBlack;
              cyBlack = cyBlack + dyBlack;
              blackBall.setLayoutX(cxBlack);
              blackBall.setLayoutY(cyBlack);
            }
        ));
    blackTimer.setCycleCount(Timeline.INDEFINITE);

    cxGray = (int) (stage.getWidth() / 2);
    cyGray = (int) (stage.getHeight() / 2);

    class GameTask extends TimerTask {
      @Override
      public void run() {
        dxGray = rnd.nextInt(20) - 10;
        dyGray = rnd.nextInt(20) - 10;
        cxGray += dxGray;
        cyGray += dyGray;
        grayBall.setLayoutX(cxGray);
        grayBall.setLayoutY(cyGray);
      }
    }
    task = new GameTask();
    grayTimer = new Timer();

    // メニューバーとメニュー項目を作成する
    MenuBar menuBar = new MenuBar();
    menuBar.setUseSystemMenuBar(true);
    Menu fileMenu = new Menu("ファイル");
    menuBar.getMenus().add(fileMenu);
    MenuItem mnuSente = new MenuItem("Black");
    mnuSente.setOnAction(event -> blackTimer.play());
    MenuItem mnuGote = new MenuItem("Gray");
    mnuGote.setOnAction(event -> grayTimer.schedule(task, 1000, 500));
    MenuItem mnuExit = new MenuItem("終了");
    mnuExit.setOnAction(event -> {
      cleanup();
      Platform.exit();
    });

    fileMenu.getItems().addAll(mnuSente, mnuGote, mnuExit);

    stage.setOnCloseRequest(event -> cleanup()); // ウィンドウが閉じる時

    BorderPane root = new BorderPane();
    AnchorPane center = new AnchorPane();
    center.getChildren().addAll(blackBall, grayBall);
    center.setFocusTraversable(true);
    center.setOnKeyPressed(event -> {
      Toolkit.getDefaultToolkit().beep();
      if (event.getCode() == KeyCode.UP)
        blackBall.setRadius(blackBall.getRadius() + 3);
      if (event.getCode() == KeyCode.DOWN)
        blackBall.setRadius(blackBall.getRadius() - 3);
      if (event.getCode() == KeyCode.RIGHT)
        grayBall.setRadius(grayBall.getRadius() + 3);
      if (event.getCode() == KeyCode.LEFT)
        grayBall.setRadius(grayBall.getRadius() - 3);
    });

    root.setTop(menuBar);
    root.setCenter(center);
    stage.setScene(new Scene(root, 400, 300));
    stage.show();
  }

  private void cleanup() {
    if (task != null) {
      task.cancel();
      task = null;
    }
    if (grayTimer != null) {
      grayTimer.cancel();
      grayTimer = null;
    }
    if (blackTimer != null) {
      blackTimer.stop();
      blackTimer = null;
    }
  }
}
