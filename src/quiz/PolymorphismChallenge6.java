package quiz;

public class PolymorphismChallenge6 {
  public static void main(String[] args) {
    Alucard alucard = new Alucard();
    System.out.println(((Dracula) alucard).getName() + alucard.getName()); // AlucardAlucard

    Dracula dracula = new Alucard();
    System.out.println(((Dracula) dracula).name + ((Dracula) dracula).getName()); // DraculaAlucard
  }

  static class Dracula {
    String name = "Dracula";

    String getName() {
      return this.name;
    }
  }

  static class Alucard extends Dracula {
    String name = "Alucard";

    @Override
    String getName() {
      return this.name;
    }
  }
}
