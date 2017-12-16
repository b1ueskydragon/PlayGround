package quiz;

public class MethodReference {

  public static void main(String[] args) {
    jump(MethodReference::printJump);

    MethodReference mr = new MethodReference();
    mr.goToilet(mr::printGoToilet);
  }

  interface Human {
    void doSomething();
  }

  static void jump(Human human) {
    human.doSomething();
  }

  static void printJump() {
    String jump = "jump";
    System.out.println(jump);
  }

  void goToilet(Human human) {
    human.doSomething();
  }

  void printGoToilet() {
    String toilet = "happy toilet";
    System.out.println(toilet);
  }
}