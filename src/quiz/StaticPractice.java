package quiz;

public class StaticPractice {

  public static void main(String[] args) {
    Human developer = new Developer();

    System.out.println(developer.getMorning());
  }
}

class Human {
  static String morning = "Happy Toilet";

  static String getMorning() {
    return morning;
  }
}

class Developer extends Human {
  static String morning = "Happy Coding";

  static String getMorning() {
    return morning;
  }
}
