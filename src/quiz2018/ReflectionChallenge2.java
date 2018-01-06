package quiz2018;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ReflectionChallenge2 {

  public static void main(String... args) {
    System.out.println(Jedi.class.getAnnotation(Table.class).name());
    System.out.println(Jedi.class.getAnnotation(Column.class).name());
  }

  @Table(name = "jedi")
  static class Jedi {
    @Column(name = "attack_type")
    String attackType;

    public String getAttackType() {
      return attackType;
    }
  }

  @Retention(RetentionPolicy.RUNTIME)
  @interface Table {
    String name();
  }

  @interface Column {
    String name();
  }
}
