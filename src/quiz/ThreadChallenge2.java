package quiz;

/**
 * デーモンスレッド
 *
 * プログラム終了のタイミングで、スレッド処理が破棄される
 * 後処理が残っている場合は使用を控える
 */
public class ThreadChallenge2 {
  static int i;

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(() -> i++);
    thread1.setDaemon(true);
    thread1.start();

    Thread thread2 = new Thread(() -> i++);
    thread2.setDaemon(true);
    thread2.start();

    thread1.join(); // スレッド終了まで待ち続ける
    thread2.join();

    Thread thread3 = new Thread(() -> {
      for (; ; ) {
        i++;
      }
    });
    thread3.setDaemon(false);
    thread3.start();

    System.out.println(i);
  }
}
