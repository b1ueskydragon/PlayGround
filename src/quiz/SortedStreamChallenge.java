package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SortedStreamChallenge {
  public static void main(String[] args) {

    Set<Hero> heroesSet = Set.of(new Hero("Spider Man"), new Hero("Wolverine"), new Hero("Batman"), new Hero("Iron Man"), new Hero("Beast"));

    List<Hero> heroesList = new ArrayList<>();
    heroesList.addAll(heroesSet);

    heroesList.stream()
        .sorted() // ClassCastException
        .forEach(w -> System.out.println(w.name));
  }

  static class Hero {
    private String name;
    Hero(String name) {
      this.name = name;
    }
  }
}
