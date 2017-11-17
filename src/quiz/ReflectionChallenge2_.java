package quiz;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ReflectionChallenge2_ {

  public static void main(String... args) {
    System.out.println(Jedi.class.getAnnotation(Table.class).name());
    System.out.println(Jedi.class.getAnnotation(Fire.class).fire());
    System.out.println(Jedi.class.getAnnotation(Column.class).name());
  }

  @Table(name = "jedi")
  private static class Jedi {
    @Column(name = "attack_type")
    String attackType;

    public String getAttackType() {
      return attackType;
    }
  }

  @Fire(fire = "fire")
  private static class AttackType {
    String fire;

    public String getFire() {
      return fire;
    }
  }

  @Retention(RetentionPolicy.RUNTIME)
  @interface Table {
    String name();
  }

  @interface Column {
    String name();
  }

  @Retention(RetentionPolicy.RUNTIME)
  @interface Fire {
    String fire();
  }
}
