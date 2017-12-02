package quiz;

public class StaticChallenge2 {

  /**
   * Static methods cannot be overridden,
   * so it doesn't matter if another instance were created.
   * we can call static variables as classes variables.
   * The static state is maintained the same to all instances.
   */
  public static void main(String[] args) {
    Simpson homerSimpson = new Simpson("Homer", 35);
    homerSimpson.age++;

    Simpson bartSimpson = new Simpson("Bart", 8);
    bartSimpson.age++;

    System.out.println(homerSimpson.name + bartSimpson.name); // BartBart
    System.out.println(homerSimpson.age + bartSimpson.age); // 9 + 9 == 18
  }

  static class Simpson {
    /**
     * static members
     */
    static String name;
    static int age;

    public Simpson(String name, int age) {
      /**
       * Shows references to static methods and fields via class instance
       * rather than a class itself.
       */
      this.name = name;
      this.age = age;
    }
  }
}
