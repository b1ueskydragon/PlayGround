package quiz;

import java.lang.reflect.Method;

public class ReflectionChallenge3 {

  public static void main(String[] args) throws Exception {

    Method method = ReflectionChallenge3.class.getDeclaredMethod("doStuff"); // このクラスの全てのメソッドの読み込み
    method.invoke(new ReflectionChallenge3()); // invoke 該当メソッドを実行する

    Method method2 = ReflectionChallenge3.class.getMethod("doStuff"); // doStuff() is not public
    method2.invoke(new ReflectionChallenge3());

  }

  void doStuff() {
    System.out.println("doStuff println");
  }
}
