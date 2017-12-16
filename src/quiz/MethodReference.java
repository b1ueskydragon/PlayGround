package quiz;

public class MethodReference {

  public static void main(String[] args) {
    jump(MethodReference::printJump);

    MethodReference mr = new MethodReference();
    mr.goToilet(mr::printGoToilet);

    mr.somthing(MethodReference.class);
  }

  interface Human {
    void doSomething();
  }

  static void jump(Human human) {
    human.doSomething();
  }

  static void printJump() {
    String jump = "jump and ";
    System.out.print(jump);
  }

  void goToilet(Human human) {
    human.doSomething();
  }

  void printGoToilet() {
    String toilet = "happy toilet";
    System.out.print(toilet);
  }

  // 上記と関係なし、パラメータに this. でクラス渡したい
  void somthing(Class<?> clazz) {
  }
}