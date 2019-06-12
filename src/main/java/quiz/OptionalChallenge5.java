package quiz;

import java.util.Optional;

public class OptionalChallenge5 {
  public static void main(String... agrs) {
    Optional<Warrior> optWarrior = Warrior.getWarrior();

    Optional<Warrior> strongestWarrior = getEmpty()
        .or(() -> Warrior.getWarrior())
        .or(() -> optWarrior);

    System.out.println(strongestWarrior.get().name);
  }

  private static Optional<Warrior> getEmpty() {
    return Optional.empty();
  }

  private static class Warrior {
    private String name;

    Warrior(String name) {
      this.name = name;
    }

    static Optional<Warrior> getWarrior() {
      return Optional.of(new Warrior("Kratos"));
    }
  }
}
