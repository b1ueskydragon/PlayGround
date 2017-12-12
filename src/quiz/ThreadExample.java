package quiz;

import java.util.Date;

class RunnableJob implements Runnable {

  @Override
  public void run() {
    Thread thread = Thread.currentThread();
    System.out.println("RunnableJob is being run by " + thread.getName() + " at " + new Date());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class ThreadExample {

  public static void main(String[] args) throws InterruptedException {

    RunnableJob runnableJob = new RunnableJob();

    Thread thread1 = new Thread(runnableJob, "T1");
    Thread thread2 = new Thread(runnableJob, "T2");
    Thread thread3 = new Thread(runnableJob, "T3");
    Thread thread4 = new Thread(runnableJob, "T4");

    // all separated by 1 second delays
    thread1.start();
    thread1.join();
    thread2.start();
    thread2.join();
    thread3.start();
    thread3.join();
    thread4.start();
    thread4.join();

    Thread thread5 = new Thread(runnableJob, "T5");
    Thread thread6 = new Thread(runnableJob, "T6");
    Thread thread7 = new Thread(runnableJob, "T7");
    Thread thread8 = new Thread(runnableJob, "T8");

    // there are no delays for T5, T6, T7, and T8.
    // T7 executes RunnableJob's run() method before T6
    // there is no guarantee as to the order that T5, T6, T7, and T8 will execute the job code.
    thread5.start();
    thread6.start();
    thread7.start();
    thread8.start();

  }
}