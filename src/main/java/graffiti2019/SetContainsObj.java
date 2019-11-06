package graffiti2019;

import java.util.HashSet;
import java.util.Set;

public class SetContainsObj {

  public static void main(String[] args) {
    Set<AObject> as = new HashSet<>();
    as.add(new AObject("a"));
    as.add(new AObject("a"));
    as.add(new AObject("a"));

    System.out.println(as.size());

    if (as.contains(new AObject("a"))) {
      System.out.println("yes because equals is overwritten and also has same hashcode");
    }
  }
}


class AObject {
  private String a;

  public String getA() {
    return a;
  }

  AObject(String a) {
    this.a = a;
  }

  @Override
  // @Data or @EqualsAndHashCode (lombok) helps auto-generate of equals(obj).
  public boolean equals(Object obj) {
    AObject aObject = (AObject) obj;
    return aObject.a.equals(a);
  }

  @Override
  // when we want override equals(obj) we also need to override hashcode().
  // @Data or @EqualsAndHashCode (lombok) helps auto-generate of hashCode().
  public int hashCode() {
    return 111222333;
  }

}
