package code.with.play;

class Outer {

  static class SomeStatic {
    private Integer in;

    public Integer getIn() {
      return in;
    }

    public void setIn(Integer in) {
      this.in = in;
    }
  }

  class SomeInner {
    private String str;

    public String getStr() {
      return str;
    }

    public void setStr(String str) {
      this.str = str;
    }
  }
}

class OuterMain {
  public static void main(String[] args) {

    Outer.SomeStatic someStatic = new Outer.SomeStatic();

    Outer outer = new Outer();
    Outer.SomeInner someInner = outer.new SomeInner();

  }
}
