package graffiti;

import java.util.ArrayList;
import java.util.List;

/**
 * メンバークラス
 * <p>
 * あるクラスのメンバーとして定義するクラスのこと
 * static の有無により意味が変わる
 */
class Outer {

  /**
   * 外部クラスやそのインスタンスとの関係が比較的薄い
   * 通常の別クラス感覚で利用できる
   * <p>
   * 「外部クラス名.メンバクラス名」で利用でき、
   * 外部クラスのメンバにアクセスできるが static なものに限られる
   */
  static class SomeStatic {
    private Integer in;

    public Integer getIn() {
      return in;
    }

    public void setIn(Integer in) {
      this.in = in;
    }
  }

  /**
   * 厳密なインナークラス
   * 外部クラスから生み出される個々のインスタンスと強い結びつきを持つ
   * <p>
   * 外部クラスのインスタンスがなければ new できない
   * また、非 static メンバにもアクセスできる
   */
  class SomeInner {
    private String str;

    public String getStr() {
      return str;
    }

    public void setStr(String str) {
      this.str = str;
    }
  }


  void someMethod() {
    // 外部クラスからは直接インスタンス化が可能
    SomeStatic someStatic = new SomeStatic();
    // 一応できる
    SomeInner someInner = new SomeInner();

    /**
     * ローカルクラス
     *
     * メソッドブロック内で宣言されるクラス定義
     * そのメソッド内部でだけ有効なローカル変数と似たような特徴を持つ
     *
     * 他のクラスやメソッドからは利用できない
     */
    class MoreInner {
      private String str;

      public String getStr() {
        return str;
      }

      public void setStr(String str) {
        this.str = str;
      }
    }

    // 同じメソッド内ですぐ利用することが前提
    MoreInner moreInner = new MoreInner();
  }
}

class OuterMain {
  public static void main(String[] args) {
    // static 付き
    Outer.SomeStatic someStatic = new Outer.SomeStatic();

    // inner class
    Outer outer = new Outer();
    Outer.SomeInner someInner = outer.new SomeInner();
  }
}

// TODO もっと詳しく extend など
class Anonymous {
  public static void main(String[] args) {

    List<Object> list = new ArrayList<>();

    /**
     * 匿名クラス
     *
     * class キーワードなしで、宣言と利用を同時に行う
     */
    list.add(new Object() {
      String innerField;

      void innerMethod() {
        // 処理
      }
    });

  }
}
