package quiz2018.review.Daemon;

public class DaemonThreadChallenge implements Runnable {

  public static void main(String... doYourBest) {
    Thread thread = new Thread(new DaemonThreadChallenge());
         // REPLACE //
  }

  @Override
  public void run() {
    for (;;) {
      System.out.println("For ever");
    }
  }
}