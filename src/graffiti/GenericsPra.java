package graffiti;

import java.util.ArrayList;
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

}
