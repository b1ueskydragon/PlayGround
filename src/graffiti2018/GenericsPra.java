package graffiti2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsPra {

  /**
   * <T>
   *   "I'm declaring an arbitrary type T for this method, which can be anything (non-primitive) for each call of the method."
   *
   * List<T>
   *   "This method will return a List containing elements of that type T."
   *
   * List<? super T> input
   * "This method will take a parameter called input, which is a List containing elements of type T, or any super-type of T.
   *  For example, if T is Integer, input could be a List<Integer>, List<Number>, or List<Object>."
   *
   * @param input
   * @param <T>
   * @return[
   */
  public static <T> List<T> backward (List<? super T> input) {
    List<T> output = new ArrayList<>();
    return output;
  }

  public static void main(String... args ) {

    // List<Object> objList = new ArrayList<String>(); // List<String> は List のサブタイプであり、List<Object> のサブタイプではない

   List<? extends Number> exNumList = new ArrayList<Integer>();
   List<?> someTypeList = new ArrayList<String>();


   List<Object> objList = new ArrayList<>();

    objList.add("a");
    objList.add(1);
    objList.add(new Inagon());

  //  objList.forEach(el -> System.out.println((String)el)); // 実行時エラー (cast)


   List rawList =  new ArrayList();
   rawList.add("a");
   rawList.add(1);
   rawList.add(new Inagon());

   // rawList.forEach(el -> System.out.println((String)el));  // 実行時エラー (cast)



    //printStrList(objList()); // コンパイルエラー
    //printObjList(strList()); // コンパイルエラー

    printList(rawList()); // できる (型安全ではない)

    printAry(strAry(new String[]{"a", "b", "c"}));

    Object[] objAry = new String[10];
    objAry[0] = 1;
    System.out.println(objAry[0]);

  }

  private static class Inagon { }

  private static List<Object> objList() {
    return new ArrayList<Object>();
  }

  private static void printStrList(List<String> strList) {
    strList.forEach(System.out::println);
  }

  private static List<String> strList() {
    return new ArrayList<String>();
  }

  private static void printObjList(List<Object> objList) {
    objList.forEach(System.out::println);
  }

  private static List rawList() {
    return new ArrayList();
  }

  private static void printList(List rawList) {
    rawList.forEach(System.out::println);
  }

  private static void printAry(Object[] objAry) {
    Arrays.stream(objAry).forEach(System.out::println);
  }


  private static String[] strAry(String[] strAry) {
    return strAry;
  }
}
