package graffiti2022;

import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        // 要素の取得時にキューが空でなくなるまで待機 or 要素の格納時にキュー内に空きが生じるまで待機する操作をサポートする Queue
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
//        final ArrayDeque<String> queue = new ArrayDeque<>(10);
        final ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            String s = String.valueOf(i);
            executor.submit(() -> {
//                queue.add(Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getName() + " polled: " + queue.poll());
                try {
                    System.out.println("[" + s + "th loop]");
                    queue.put(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getName() + " polled: " + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        // 新しいタスクを受け付けない(実行中のタスクがある場合はそのまま実行)
        // should call shutdown first
        executor.shutdown();
        // 実行中のタスクが終了するまで処理をブロックする
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(queue.size());
    }
}
