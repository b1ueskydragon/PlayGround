package quiz;

public class StaticChallenge6 {

  public static void main(String[] args) {
    Homer bart = new Bart();

    System.out.println(bart.age + bart.getAge());

    System.out.println(bart.getAgeNotStatic());
  }

  static class Homer {
    static int age = 35;

    static int getAge() {
      return age;
    }

    int getAgeNotStatic() {
      return age;
    }
  }

  static class Bart extends Homer {
    static int age = 8;

    // override は super より公開範囲が広ければ ok
    // not an override (cause of static)
    public static int getAge() {
      return age;
    }

    @Override
    int getAgeNotStatic() {
      return age; // 8
      //return super.getAgeNotStatic(); // 35
    }
  }
}
