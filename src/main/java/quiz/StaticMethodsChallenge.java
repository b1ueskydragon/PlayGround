package quiz;

public class StaticMethodsChallenge {

  static class Stark {
    static void talk() {
      System.out.println("The winter is coming");
    }
  }

  static class Ned extends Stark {
    static void talk() {
      System.out.println("The only time a man can be brave is when he is afraid.");
    }
  }

  public static void main(String[] args) {
    Stark stark = new Ned();

    stark.talk();
  }
}
