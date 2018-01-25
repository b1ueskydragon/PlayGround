package quiz2018;

public class ConstructorChallenge2 {
  public static void main(String... args) {
    new Neo("roundhousekick");
    Superpower.print();
  }

  static class Superpower {
    private static String superpower = "";

    public Superpower(String weapon, String action, int force) {
      superpower += weapon + "," + action + "," + force;
    }

    private static void print() {
      System.out.println("|" + superpower + "|");
    }
  }

  static class Neo extends Superpower {
    public Neo(String action) {
      this(action, 99);
    }

    public Neo(String action, int force) {
      this("revolver", action, force);
    }

    public Neo(String weapon, String action, int force) {
      super(weapon, action, force);
    }
  }
}
