package quiz;

import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 正規表現 \w
 *
 * “単語”を構成するキャラクタ、
 * つまり文字と数字それにアンダースコア のいずれかにマッチします。
 * これは[[:alnum:]]と同じ意味になります。
 */
public class FunctionChallenge2 {

  public static void main(String[] args) {
    String starWars = "Luke, DarthVader";

    Function<String, Stream<String>> lineSplitter =
        l -> Pattern.compile("\\w").splitAsStream(l);

    List<String> list = Stream.of(starWars)
        .flatMap(lineSplitter)
        .collect(Collectors.toList());

    System.out.println(list.size());
    list.forEach(System.out::println);
  }
}
