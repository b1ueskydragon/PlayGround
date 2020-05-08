package graffiti2020;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class MyConcurrent {

  private static MyConcurrent instance = new MyConcurrent();

  public static MyConcurrent getInstance() { return instance; }

  /*
   * The number of thread for concurrency.
   * Set 1 will behave as a sequential execution.
   * We can confirm this from the execution time measurement.
   */
  private static final int WORKER_THREAD_PER_SYNC = 3;

  private final ExecutorService es = Executors.newFixedThreadPool(WORKER_THREAD_PER_SYNC);

  /* limitation of stream. task size. */
  private static final int SIZE = 30;

  private void jobX(final long task) {
    System.out.printf("Here's a task ID. %d \n", task);
    try {
      Thread.sleep(3000L); // Set a blocking process intentionally.
    } catch (InterruptedException e) {
      throw new RuntimeException("Uh-oh; Something went wrong. ");
    }
    System.out.printf("Finished. task ID. %d \n", task);
  }

  private void process(final AtomicLong atomic) {
    final CompletableFuture[] tasks =
        Stream.generate(atomic::incrementAndGet)
            .map(task -> CompletableFuture.runAsync(() -> jobX(task), es))
            .limit(SIZE)
            .toArray(CompletableFuture[]::new);

    // Returns the result value when complete, or throws an exception if completed exceptionally.
    CompletableFuture.allOf(tasks).join();

    // For a safety.
    // Invocation has no additional effect if already shut down.
    es.shutdown();
  }

  private void process(final Random random) {
    final CompletableFuture[] tasks =
        Stream.generate(() -> randomTaskId(random))
            .map(task -> CompletableFuture.runAsync(() -> jobX(task), es))
            .limit(SIZE)
            .toArray(CompletableFuture[]::new);

    // Returns the result value when complete, or throws an exception if completed exceptionally.
    CompletableFuture.allOf(tasks).join();

    // For a safety.
    // Invocation has no additional effect if already shut down.
    es.shutdown();
  }

  /* For generate a random ID for each tasks. */
  private long randomTaskId(final Random random) {
    final int digit = 3;
    final long min = (long) Math.pow(10, digit - 1);
    final long max = min * 10 - 1;
    final long bound = max - min + 1;
    return min + (long) (random.nextDouble() * bound);
  }

  public static void main(String[] args) {
    final Random random = new Random();
    final AtomicLong atomic = new AtomicLong(0x64);

    final long start = System.currentTimeMillis();
    // MyConcurrent.getInstance().process(random);
    MyConcurrent.getInstance().process(atomic);
    System.out.println((double) (System.currentTimeMillis() - start) / 1000 + " sec. ");
  }
}
