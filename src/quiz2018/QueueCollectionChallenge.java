package quiz2018;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue; // このキューの「先頭」は, キューに入っていた時間がもっとも長い要素

public class QueueCollectionChallenge {
  private static int CAPACITY = 5;

  public static void main(String... args) {
    Queue<String> breakingBadQueue = new ArrayBlockingQueue<>(CAPACITY);

    breakingBadQueue.add("Heisenberg"); // キューの容量を超えずにすぐ実行できる場合は, 指定された要素をこのキューの末尾に挿入
    breakingBadQueue.add("Jesse");
    breakingBadQueue.offer("Gus"); // キューの容量を超えずに指定された要素をこのキューの末尾にすぐ挿入できる場合は, そうします
    breakingBadQueue.offer("Walter White Junior");
    breakingBadQueue.offer("Saul Goodman");
    breakingBadQueue.offer("Hank");

    String character = breakingBadQueue.peek();
    String anotherCharacter = breakingBadQueue.poll();

    ArrayBlockingQueue<String> arrayBlockingQueue = (ArrayBlockingQueue<String>) breakingBadQueue;
    arrayBlockingQueue.offer(character);
    arrayBlockingQueue.offer(anotherCharacter);

    System.out.println(breakingBadQueue);
  }
}
