package javaSilverSE8;

class SomethingFoo {
  static {
    System.out.println("Class SomethingFoo: I'm Static Initializer");
  }

  SomethingFoo() {
    System.out.println("Class SomethingFoo: I'm Constructor");
  }
}

public class InitializerConstructor {
  static {
    System.out.println("Class InitializerConstructor: I'm Static Initializer");
  }

  public static void main(String[] args) {
    System.out.println("Class InitializerConstructor: I'm main() method");
    SomethingFoo somethingFoo = new SomethingFoo();
  }
}

