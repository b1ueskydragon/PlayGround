package quiz2018;

public class PolymorphismChallenge3 {

  static class Jedi {
    static void attack() {
      System.out.println("Any Jedi's attack");
    }
  }

  static class Luke extends Jedi {
    static void attack() { // static method cannot be overwritten.
      System.out.println("Luke's attack");
    }
  }

  public static void main(String... args) {
    Jedi jedi = new Luke();

    jedi.attack(); // method of Jedi Class (not Luke)

    // Jedi.attack();
    // Access static method or field, via class itself.
  }
}
