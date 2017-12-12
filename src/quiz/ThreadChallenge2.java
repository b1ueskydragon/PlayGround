package quiz;

/**
 * a Daemon is a computer program that runs as a background process,
 * rather than being under the direct control of an interactive user.
 *
 * setDaemon(true)
 *
 * プログラム終了のタイミングで、スレッド処理が破棄される
 * 後処理が残っている場合は使用を控える
 *
 *
 * join()
 *
 * スレッド終了まで待ち続ける
 * 実行順番に関しては、without join(), There's is no guarantee.
 *
 *
 * synchronized
 *
 * only one thread can access that synchronized method/variable at a time.
 * It doesn't matter if you use join() or not.
 *
 * Thread.join() waits for the thread to completely finish,
 * whereas a synchronized block can be used to prevent two threads from executing the same piece of code at the same time.
 */
public class ThreadChallenge2 {
  static int i;
  static int a;
  static double b;

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(() -> a++); // quiz もともとは i
    thread1.setDaemon(true);
    thread1.start();

    Thread thread2 = new Thread(() -> b++); // quiz もともとは i
    thread2.setDaemon(true);
    thread2.start();

    thread1.join(); // will be start first
    thread2.join(); // will be start only after above.

    Thread thread3 = new Thread(() -> {
      for (; ; ) {
        i++;
       // System.out.println("実行"); // 順番を確認
      }
    });
    thread3.setDaemon(true); // quiz もともとは false
    thread3.start();

    System.out.println(b);
    System.out.println(i);
    System.out.println(a);
  }
}
