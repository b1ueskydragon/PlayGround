package graffiti;

import java.util.Arrays;
import java.util.List;

/**
 * the source list src (the producing list) uses extends,
 * and
 * the destination list dest (the consuming list) uses super.
 */
public class CollectionsT {
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
      for (int i = 0; i < src.size(); i++) {
        dest.set(i, src.get(i));
      }
    }

    public static void main(String [] args) {
      List<Integer> testList = Arrays.asList(1,2,3,4,5);
      copy(testList,testList); // ?? w
    }
}
