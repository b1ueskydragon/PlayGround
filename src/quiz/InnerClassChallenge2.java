package quiz;

public class InnerClassChallenge2 {
  class Jedi {
    String attack = "slash";

    String attack() {
      return attack;
    }
  }

  public static void main(String... args) {
    // System.out.println(new Jedi().attack()); // static でない変数 this を static コンテキスト参照できない
    InnerClassChallenge2 innerClassChallenge2 = new InnerClassChallenge2();
    System.out.println(innerClassChallenge2.new Jedi().attack());
  }
}
