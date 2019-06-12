package quiz2018;

public class AbstractChallenge {
  static final int FORCE = 10;

  public static void main(String... args) {

    DarthVader darthVader = new DarthVader() { //anonymous inner class: interface の実装とそれを実装する匿名クラスのインスタンス生成を同時に行う
      @Override
      public int getNumber(int number) {
        return number;
      }
    };

    AbstractChallenge abstractChallenge = new AbstractChallenge();

    MasterYoda masterYoda = abstractChallenge.new MasterYoda() { // anonymous inner class
      @Override
      public int getNumber(int number) {
        return number;
      }
    };

    System.out.println(darthVader.getNumber(FORCE));
    System.out.println(masterYoda.getNumber(new Integer(FORCE)));  // the method from the abstract class will be invoked
    //System.out.println(masterYoda.getNumber(FORCE));
    System.out.println("The stronger Jedi is: " + (darthVader.getNumber(FORCE) > masterYoda.getNumber(FORCE) ? "Darth Vader" : "Master Yoda"));
  }

  // abstract class
  abstract class MasterYoda implements LukeSkywalker {
    public int getNumber(Integer force) { // not an Override, it's an overloading (param type is not same: integer != int)
      return force + 10;
    }
  }

  // interfaces
  interface LukeSkywalker extends DarthVader {
    @Override
    int getNumber(int force);
  }

  interface DarthVader {
    int getNumber(int force);
  }
}
