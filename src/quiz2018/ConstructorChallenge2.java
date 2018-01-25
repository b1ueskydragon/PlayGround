package quiz2018;

public class ConstructorChallenge2 {
  public static void main(String... args) {
    new Neo("roundhousekick");
    Superpower.print();
  }

  private static class Superpower {
    private static String superpower = "";

    Superpower(String weapon, String action, int force) {
      superpower += weapon + "," + action + "," + force;
    }

    private static void print() {
      System.out.println("|" + superpower + "|");
    }
  }

  private static class Neo extends Superpower {
    Neo(String action) {
      this(action, 99);
    }

    Neo(String action, int force) {
      this("revolver", action, force);
    }

    Neo(String weapon, String action, int force) {
      super(weapon, action, force);
    }
  }
}
