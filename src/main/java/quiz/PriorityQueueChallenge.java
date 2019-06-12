package quiz;

import java.util.PriorityQueue;

public class PriorityQueueChallenge {

    public static void main(String [] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        // 自然順序付けされるキュー

        priorityQueue.offer("Homer");
        priorityQueue.offer("Margie");
        priorityQueue.offer("Bart");

        priorityQueue.forEach(System.out::println);

        priorityQueue.peek(); // キューの先頭を取得しますが、削除しない (ない場合 return null)

        priorityQueue.poll(); // キューの先頭を取得および削除する (ない場合 return null)
        priorityQueue.poll();

        priorityQueue.forEach(System.out::println); // Margie

        System.out.println(
                priorityQueue.stream()
                .filter(s -> s.startsWith("Ho"))
                .findFirst() // Stream 内の先頭の要素を返す。戻り値はOptional<T>
                .get());
    }
}

// NoSuchElementException
