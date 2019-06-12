package quiz;

public class PolymorphismChallenge5 {
  public static void main(String[] args) {
    Dracula dracula = new Alucard();

    System.out.println(dracula.name + dracula.getName());
  }

  static class Dracula {
    String name = "Dracula";

    String getName() {
      return this.name;
    }
  }

  static class Alucard extends Dracula {
    String name = "Alucard"; // フィールド: 属性. ここでは可変初期値も指定. Fields can't be overridden

    String getName() { // メソッド: 操作. Overriding is for instance methods
      return this.name;
    }
  }
}
