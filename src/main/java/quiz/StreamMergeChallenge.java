package quiz;

import java.util.List;
import java.util.stream.Stream;

public class StreamMergeChallenge {
  public static void main(String[] main) {

    Stream<String> stream1 = List.of("Luke", "Darth Vader").stream();
    Stream<String> stream2 = List.of("Obi Wan", "Qui gon jinn").stream();
    Stream<String> stream3 = List.of("Han Solo", "Darth Maul", "Palpatine").stream();

    Stream<Stream<String>> streamOfStream = Stream.of(stream1, stream2, stream3);
    long streamOfStreamCount = streamOfStream.count(); // 3

    Stream<String> finalStream = streamOfStream.flatMap(s -> s);  // put s :Stream<String> -> return s :Stream<String>
    System.out.println(finalStream.count() + streamOfStreamCount);

    // the flatMap above sysout will throw an exception cause stream has already been consumed with .count()
  }
}
