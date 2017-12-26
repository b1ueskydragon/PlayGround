package quiz;

public class PolymorphismChallenge7 {
  public static void main(String... args) {
    Person santa = new SantaClaus("Jet-Pack");
    santa.givePresent();
    new SantaClaus("Rocket-Launcher").givePresent("Little-Duck");
  }

  private abstract static class Person {
    protected String present;

    Person(String present) {
      this.present = present;
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
      System.out.println(present + " <- super");
    }

    @Override
    void givePresent() {
      System.out.println("Santa " + present);
    }
  }
}
