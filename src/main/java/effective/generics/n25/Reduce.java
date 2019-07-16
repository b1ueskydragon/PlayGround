package effective.generics.n25;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Reduce {

  // 並行性の欠陥
  public static Object reducePrototype(List list, Function f, Object initVal) {
    synchronized (list) {
      Object result = initVal;
      for (Object o : list) {
        result = f.apply(result, o);
      }
      return result;
    }
  }

  public static Object reduceNonGeneric(List list, Function f, Object initVal) {
    Object[] snapshot = list.toArray(); // リストを内部的にロック
    Object result = initVal;
    for (Object o : snapshot) {
      result = f.apply(result, o);
    }
    return result;
  }


  public static <E> E reduceGeneric(List<E> list, Function<E> f, E initVal) {
    List<E> snapshot;
    synchronized (list) {
      snapshot = new ArrayList<>(list);
    }
    E result = initVal;
    for (E e : snapshot) {
      result = f.apply(result, e);
    }
    return result;
  }
}
