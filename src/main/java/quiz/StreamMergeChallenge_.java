package quiz;

import java.util.List;
import java.util.stream.Stream;

public class StreamMergeChallenge_ {
  public static void main(String[] main) {

    Stream<String> stream1 = List.of("Luke", "Darth Vader").stream();
    Stream<String> stream2 = List.of("Obi Wan", "Qui gon jinn").stream();
    Stream<String> stream3 = List.of("Han Solo", "Darth Maul", "Palpatine").stream();

    Stream<Stream<String>> streamOfStream = Stream.of(stream1, stream2, stream3);
    long streamOfStreamCount = streamOfStream.count(); // 3

    long count1 = stream1.count(); // 2
    long count2 = stream2.count(); // 2
    long count3 = stream3.count(); // 3

    System.out.println(count1 + count2 + count3 + streamOfStreamCount); // 10

  }
}
