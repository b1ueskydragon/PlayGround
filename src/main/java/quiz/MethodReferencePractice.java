package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

/**
 * http://www.ne.jp/asahi/hishidama/home/tech/java/methodreference.html
 */
public class MethodReferencePractice {

  public static void main(String[] args) {

    // インスタンスメソッド クラス名渡し 引数1個
    // メソッド参照
    ToIntFunction<String> f1 = String::length;
    int n1 = f1.applyAsInt("abc");
    System.out.println(n1);

    //　ラムダ式
    ToIntFunction<String> f2 = s -> s.length();
    int n2 = f2.applyAsInt("def");
    System.out.println(n2);


    // インスタンスメソッド クラス名渡し 引数2個
    // メソッド参照
    BiFunction<List<String>, String, Boolean> f3 = List::add;
    List<String> list1 = new ArrayList<>();
    f3.apply(list1, "ghi");
    System.out.println(list1);

    // ラムダ式
    BiFunction<List<String>, String, Boolean> f4 = (list, s) -> list.add(s);

    List<String> list2 = new ArrayList<>();
    f4.apply(list2, "jkl");
    System.out.println(list2);
  }
}


class Example {

  // ジェネリクス メソッド参照
  static <T> void methodG(T arg) { }

  static void test() {
    Consumer<String> c = Example::<String>methodG;
  }


  public void method1() {
    IntSupplier supplier = this::method2;
    System.out.println(supplier.getAsInt());
  }

  public int method2() {
    return 123;
  }
}
