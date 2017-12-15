package graffiti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatmapVSmap {

  public static void main(String[] args) {

    List<String> sampleList = new ArrayList<>();
    sampleList.add("Crocodile");
    sampleList.add("Hacker");
    sampleList.add("Dragon");

    List<String> anotherList = new ArrayList<>();
    anotherList.add("compass");
    anotherList.add("blade");
    anotherList.add("universe");
    anotherList.add("monolith");

    // filter VS map

    List<String> collects = sampleList
        .stream()
        .filter(s -> s.startsWith("H"))
        .collect(Collectors.toList());

    List<Boolean> collectb = sampleList
        .stream()
        .map(s -> s.startsWith("H"))
        .collect(Collectors.toList());


    // map VS flatMap

    List<List<String>> finalList = Arrays.asList(sampleList, anotherList);

    Stream<Stream<String>> useMap = finalList.stream().map(l -> l.stream());

    Stream<String> useFlat = finalList.stream().flatMap(l -> l.stream());

  }
}
