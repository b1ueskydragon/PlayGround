package quiz;

/**
 * メソッド参照
 *
 * 関数型インターフェースの変数にメソッドそのものを代入すること.
 *
 * static メソッド
 * クラス名::メソッド名
 *
 * インスタンスメソッド
 * インスタンス変数名::メソッド名
 *
 *
 * 関数型インターフェース
 *
 * 抽象メソッドが1つだけ定義されているインターフェース.
 * ラムダ式やメソッド参照の代入先になれるインターフェースのこと.
 *
 */
public class MethodReferenceChallenge3 {

  public static void main(String[] args) {
    attack(MethodReferenceChallenge3::printAttack);
    jump(MethodReferenceChallenge3::printJump);

    MethodReferenceChallenge3 mrc = new MethodReferenceChallenge3();
    mrc.coding(mrc::printCoding);
  }

  interface Luke {
    void attack();
  }

  interface Anakin {
    void jump();
  }

  static void jump(Anakin anakin) {
    anakin.jump();
  }

  static void printAttack() {
    System.out.println("attack");
  }

  static String printJump() {
    String jump = "jump";
    System.out.println(jump);
    return jump;
  }

  static void attack(Luke luke) {
    luke.attack();
  }


  interface Inagon {
    void coding();
  }
  // 非 static インスタンスメソッド
  void coding(Inagon inagon) {
    inagon.coding();
  }

  void printCoding(){
    System.out.println("coding");
  }
}
