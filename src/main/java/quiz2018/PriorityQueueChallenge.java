package quiz2018;

import java.util.PriorityQueue;

public class PriorityQueueChallenge {

  public static void main(String... args) {
    PriorityQueue<String> priorityQueue = new PriorityQueue<>(); // a natural order queue

    priorityQueue.offer("Homer");
    priorityQueue.offer("Margie");
    priorityQueue.offer("Bart");

    priorityQueue.peek();

    priorityQueue.poll();
    priorityQueue.poll();

    System.out.println(priorityQueue.stream()
        .filter(s -> s.toString().toString()
        .startsWith("Ho")).findFirst().get());
  }
}
