package graffiti;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java9Pra {
  public static void main(String... args) {

    Optional<String> optional = Optional.ofNullable("");
    Optional<String> optional2 = Optional.ofNullable(null);
    optional.ifPresentOrElse(t -> System.out.println(true), () -> System.out.println(false));
    optional2.ifPresentOrElse(t -> System.out.println(true), () -> System.out.println(false));

    List<Object> optional3 = Optional.ofNullable(null).stream().collect(Collectors.toList());
    List<String> optional4 = Optional.ofNullable((String) null).stream().collect(Collectors.toList());

    List<String> list = List.of("aaa", "bbb");
    List<String> list2 = null;
    Optional.ofNullable(list).stream().flatMap(t -> t.stream()).forEach(System.out::println);
    Optional.ofNullable(list2).stream().flatMap(t -> t.stream()).forEach(System.out::println);

    // Optional.or メソッド
    System.out.println(Optional.ofNullable("aaa").or(() -> Optional.of("bbb")).get());
    System.out.println(Optional.ofNullable(null).or(() -> Optional.of("bbb")).get());
  }
}
