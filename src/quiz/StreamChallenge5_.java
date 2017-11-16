package quiz;

import java.util.Optional;

public class StreamChallenge5_ {

  private static Optional<Jedi> getEmpty(){
    return Optional.empty();
  }

  public static void main(String... args) {

    Optional<Jedi> optJedi = Jedi.getJedi();

    Optional<Jedi> jediGon = getEmpty()
        .or(Jedi::getJedi)
        .or(() -> optJedi);

    jediGon.stream()
        .filter(jedi -> jedi.name.startsWith("Obi"))
        .map(Jedi::getAge)
        .filter(age -> age > 30)
        .forEach(System.out::println);
  }

  private static class Jedi {
    private String name;
    private int age;

    Jedi(String name, int age) {
      this.name = name;
      this.age = age;
    }

    String getName() {
      return name;
    }

    int getAge() {
      return age;
    }

    static Optional<Jedi> getJedi() {
      return Optional.of(new Jedi("Inagon", 23));
    }
  }

}
