package effective.variableArityMethod.n42;

public class N42 {
  static int sum(int... args) {
    int sum = 0;
    for (int arg : args)
      sum += arg;
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3));
    System.out.println(sum());
  }
}

