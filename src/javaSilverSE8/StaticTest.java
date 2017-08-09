package javaSilverSE8;

class Foo {
    static {
        System.out.println("Fooクラスのstaticイニシャライザ");
    }
    Foo () {
        System.out.println("Fooクラスのコンストラクタ");
    }
}


public class StaticTest {
    static {
        System.out.println("StaticTestクラスのイニシャライザ");
    }
    public static void main(String [] args) {
        System.out.println("StaticTestクラスのmainメソッド");
        Foo foo = new Foo();
    }
}

// ちなみに javac で StaticTest コンパイルすると Foo も StaticTest もコンパイルされる
// コマンド実行時パッケージ名注意