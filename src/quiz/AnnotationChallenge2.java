package quiz;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class AnnotationChallenge2 {
  public static void main(String[] args) {
    System.out.println(Jedi.class.getDeclaredFields()[0].getAnnotation(Column.class).name());
    System.out.println(Jedi.class.getDeclaredFields()[1].getAnnotation(Column.class).name());
    System.out.println(Jedi.class.getDeclaredFields()[2].getAnnotation(Column.class).name());

    // returns an array of objects reflecting all the fields
    Arrays.stream(Jedi.class.getDeclaredFields()).forEach(System.out::println);
  }

  static class Jedi {
    @Column(name = "attack_type")
    protected String attackType;
    @Column(name = "age")
    private String age;
    @Column(name = "saber")
    String saber;
  }

  @Retention(RetentionPolicy.RUNTIME)
  @interface Column {
    String name();
  }
}
