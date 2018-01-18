package effective.variableArityMethod.n42;

public class N42 {
  // 可変長引数の単純な利用(0個以上の引数)
  static int sum(int... args) {
    int sum = 0;
    for (int arg : args)
      sum += arg;
    return sum;
  }

  // 1個以上の引数を渡すための正しい可変長引数の利用方法
  static int min(int firstArg, int... remainingArgs) {
    int min = firstArg;
    for (int arg : remainingArgs)
      if (arg < min)
        min = arg;
    return min;
  }

  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3));
    System.out.println(sum());

    System.out.println(min(10, -1, 2, 3));

    int sum = 0;

    for (String arg : args)
      sum += Integer.parseInt(arg);

    System.out.println(sum);
  }

}

