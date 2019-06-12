package quiz;

public class PolymorphismChallenge7 {
  public static void main(String... args) {
    Person santa = new SantaClaus("Jet-Pack");
    santa.givePresent();
    new SantaClaus("Rocket-Launcher").givePresent("Little-Duck");
  }

  private abstract static class Person {
    protected String present; // private だと sub class で アクセス不可

    Person(String present) {
      this.present = present;
      System.out.println(present + " <- Person constructor");
    }

    void givePresent() {
      System.out.println("Give " + present);
    }

    void givePresent(String present) {
      System.out.println("Give " + present);
    }
  }

  private static class SantaClaus extends Person {
    public SantaClaus(String present) {
      super(present); // 親の？
      System.out.println(present + " <- SantaClaus constructor");
    }

    @Override
    void givePresent() {
      System.out.println("Santa " + present);
    }
  }
}
