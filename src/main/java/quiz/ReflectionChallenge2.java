package quiz;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * リフレクションは、文字列で指定されたクラスのメソッドの実行などを可能にし、
 *　プログラムの自由度を向上させる便利な技法。
 *
 *  アクセッサなしでクラスに直接接近できる。
 *
 *  その分、副作用などに気をつければならない。
 *  (クラス名変更による class not found など)
 */
public class ReflectionChallenge2 {

  public static void main(String... args) {
    System.out.println(Jedi.class.getAnnotation(Table.class).name());
    System.out.println(Jedi.class.getAnnotation(Column.class).name()); // NullPointerException
  }

  @Table(name = "jedi")
  private static class Jedi {
    @Column(name = "attack_type")
    String attackType;

    public String getAttackType() {
      return attackType;
    }
  }

  /**
   * classファイルに記録され実行時に参照できる
   * (実行する際にも JVM に、そのアノテーションの情報が読み込まれる)
   */
  @Retention(RetentionPolicy.RUNTIME)
  @interface Table {
    String name();
  }

  // ちなみに、RetentionPolicy.SOURCE はコンパイル時に破棄される

  /**
   * ＠Retention が省略された場合のデフォルト値。
   * classファイルに記録されるが実行時には保持されない
   *
   * (コンパイルした class ファイル内にそのアノテーションの情報が保持されるが、
   * 実行時には読み込まれない)
   */
  @interface Column {
    String name();
  }
}
