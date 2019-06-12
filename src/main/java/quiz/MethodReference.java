package quiz;

public class MethodReference {

  public static void main(String[] args) {
    // static メソッド
    wakeUp(MethodReference::printWakeUp);

    System.out.print(" and ");

    // インスタンスメソッド
    MethodReference mr = new MethodReference();
    mr.goToilet(mr::printGoToilet);
  }

  interface Human {
    void doSomething();
  }

  static void wakeUp(Human human) {
    human.doSomething();
  }

  static void printWakeUp() {
    String wakeUp = "wake up";
    System.out.print(wakeUp);
  }

  void goToilet(Human human) {
    human.doSomething();
  }

  void printGoToilet() {
    String toilet = "happy toilet";
    System.out.print(toilet);
  }
}