package graffiti2018;

public class CompareTo {
  public static void main(String... args) {
    Integer s1 = 1;
    Integer s2 = 2;
    System.out.println(s1.compareTo(s2)); // s1 < s2 => -1

    String o1 = "b";
    String o2 = "a";
    System.out.println(o1.compareTo(o2)); // o1 > o2 => 1

    String d1 = "20180326";
    String d2 = "201803260900";
    System.out.println(d1.compareTo(d2)); // -4

    String dd1 = "20180327";
    String dd2 = "201803260900";
    System.out.println(dd1.compareTo(dd2)); // 1
  }
}
