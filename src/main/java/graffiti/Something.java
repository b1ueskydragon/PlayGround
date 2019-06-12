package graffiti;

class Something {

  void printA() {
    System.out.print("t");
  }

  void printB() {
    System.out.print("e");
  }

  Something () {
    System.out.print("l");
    printB();
  }

  static {
    System.out.print("i");
  }
}

class StaticTest {
  static {
    System.out.print("T");
  }

  public static void main(String [] args) {
    System.out.print("o");
    new Something().printA();
  }
}

class SomethingOri {
  static {
    System.out.print("A");
  }
  SomethingOri () {
    System.out.print("B");
  }
}

class StaticTestOri {
  static {
    System.out.print("C");
  }
  public static void main(String [] args) {
    System.out.print("D");
    SomethingOri somethingOri = new SomethingOri();
  }
}