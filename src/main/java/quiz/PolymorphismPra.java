package quiz;

/**
 * スーパークラス内で定義された protected なメンバ変数やメンバメソッドは
 * サブクラス内からもアクセスができ、他のクラス内からもアクセスが可能.
 * パッケージが同じなら public と同じ.
 * 意味合い的には継承されたサブクラス内からアクセスされるようなメンバに対して付けることになっている.
 *
 * public は異なるパッケージからでもアクセス可能、
 * protected は異なるパッケージからは private と同等.
 */
public class PolymorphismPra {
  public static void main(String args[]) {
    B sample = new B();

    System.out.println("サブクラスからのアクセス");
    sample.getVar();

    System.out.println("他クラスからのアクセス");
    System.out.println("値：" + sample.get());
  }
}

class A {
  protected int var = 1;

  protected int get() {
    return var;
  }
}

class B extends A {
  public void getVar() {
    System.out.println("値：" + var);
    System.out.println("値：" + get());
  }
}
