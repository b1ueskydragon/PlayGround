package graffiti2018.accessTest;

public class ChildClass extends SomeClass {
  public static void main(String... args) {
    System.out.println(new ChildClass().someString());
  }

  @Override
  public String someString() { // 親より広い範囲(protected < public)なら指定可能
    return "I'm child's method";
  }
}
