package quiz2018.review.collections;

import java.util.HashSet;
import java.util.Set;


/**
 * Quiz: display 3
 *
 * The Set Collection adds only unique elements and uses the equals and hashcode method to verify if the objects are different.
 * The hashcode method as the name says is a unique number that can be generated with an algorithm or it can just return a constant. That's exactly what is happening on this quiz, there is a crazy calculation but the number is always the same.
 * The equals method was made to most of the times compare every field to know if the objects are equals.
 * The hashcode method will be executed first and then the equals method. That's because if the number of the hashcode is different, it means that the objects are different and it will be more performant than comparing all the fields with the equals method.
 * The equals method will be only executed if the number of hashcode method from the objects are different. Then every field will be compared if they equal the objects will be equals and not if they are not.
 */
public class SetChallenge {
  public static void main(String... args) {
    Set<Object> set = new HashSet<>();
    set.add(new Simpson("Homer"));
    set.add(new Simpson("Homer"));
    set.add(new Simpson("Bart"));
    set.add(new Simpson("Bart"));
    set.add(new Simpson("Krusty"));
    System.out.println(set.size());
  }

  static class Simpson {
    String name;

    public Simpson(String name) {
      this.name = name;
    }

    public int hashCode() {
      return 1 >> 1 % 500 + 300 / 2000;
    }

    public boolean equals(Object obj) {
      return this.name.equals(((Simpson) obj).name);
    }
  }
}