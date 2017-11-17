package quiz;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

public class ReflectionChallenge2__ {

  public static void main(String... args) {
    System.out.println(Jedi.class.getAnnotation(Table.class).name());
    System.out.println();

    Arrays.stream(Jedi.class.getAnnotations())
        .forEach(System.out::println);
    // @ReflectionChallenge2__$Table(name="jedi")
  }

  @Table(name = "jedi")
  private static class Jedi {
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

  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.FIELD})
  @interface Column {
    String name();
  }
}
