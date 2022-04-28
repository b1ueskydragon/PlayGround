package graffiti2022;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

class SimpleService {
    private static final SimpleService instance = new SimpleService();

    // TODO synchronized list

    public static SimpleService getInstance() {
        return instance;
    }

    private final long startAt;

    private SimpleService() {
        startAt = System.nanoTime();
    }

    public void job() throws Exception {
        Thread.sleep(100); // A bit heavy task
    }

    public void aggregate() {
        final long t = System.nanoTime() - startAt;
        System.out.println("elapses: " + TimeUnit.SECONDS.convert(t, TimeUnit.NANOSECONDS) + " sec");
    }
}

public class ParallelExecution {
    public static void main(String[] args) throws Exception {
        final var singleton = SimpleService.getInstance();
        final int taskCount = 1000;
        final int threadCount = 10; // 並列数
        final ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        final List<Callable<String>> tasks = new LinkedList<>();
        IntStream.range(0, taskCount)
                 .forEach(i -> tasks.add(() -> {
                     singleton.job();
                     return "OK";
                 }));

        final List<Future<String>> futures = executor.invokeAll(tasks);
        for (var future : futures) {
            future.get();
        }

        singleton.aggregate();

        // shutdown and terminate anyway
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}
