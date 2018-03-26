package graffiti2018;

public class CompareTo {
  public static void main(String... args) {
    Integer s1 = 1;
    Integer s2 = 2;
    System.out.println(s1.compareTo(s2)); // s1 < s2 => -1

    String o1 = "b";
    String o2 = "a";
    System.out.println(o1.compareTo(o2)); // o1 > o2 => 1
  }
}
