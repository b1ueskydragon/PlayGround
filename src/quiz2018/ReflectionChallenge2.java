package quiz2018;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

@SuppressWarnings(value = "all")
public class ReflectionChallenge2 {

  public static void main(String... args) throws NoSuchFieldException {
    System.out.println(Jedi.class.getAnnotation(Table.class).name());
//    System.out.println(Jedi.class.getField("attackType").getAnnotation(Column.class).name());

    Arrays.stream(Jedi.class.getFields()).forEach(System.out::println); // attackType should be public if we want reference this one

//    System.out.println(Jedi.class.getAnnotation(Column.class).name());
  }

  @Table(name = "jedi")
  public static class Jedi {
    @Column(name = "attack_type")
    public String attackType;

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
