package quiz;

public class InterfacesChallenge1 {
  interface Jedi {
    /**
     * default 修飾子: インタフェースの具像メソッド
     * public のみ
     */
    default int attack() {
      return jump() + useSaber() + useForce();
    }
    /**
     * Java 8 からは private も許可
     *
     * protected は使えない
     */
    private int useForce() {
      return Integer.valueOf("5");
    }

    private static int useSaber() {
      return Integer.valueOf("3");
    }

    private int jump() {
      return Integer.valueOf("1");
    }
  }

  public static void main(String[] args) {
    /**
     * インターフェースを継承した名前の無いクラスを new している
     */
    System.out.println(new Jedi() {}.attack() + Jedi.useSaber());
  }
}
