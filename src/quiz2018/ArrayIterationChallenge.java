package quiz2018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *  See: https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html
 *
 *  Note that Iterator.remove is the only safe way to modify a collection during iteration;
 *  the behavior is unspecified if the underlying collection is modified in any other way
 *  while the iteration is in progress.
 *
 *  If you also need the ability to add elements while iterating, use a ListIterator.
 */
public class ArrayIterationChallenge {
  public static void main(String... args) {
    List<String> list = new ArrayList<>();

    list.add("var1");
    list.add("var2");
    list.add("var3");
    list.add("var4");
    list.add("var5");

    for (String var : list) {
      if (var.equals("var2")) list.remove(var); // ConcurrentModificationException
    }

    Iterator<String> it = list.iterator();
    while(it.hasNext()) {
      String s = it.next();
      if (s.equals("var2")) list.remove(s); // ConcurrentModificationException
    }

    Iterator<String> itt = list.iterator();
    while(itt.hasNext()) {
      String s = itt.next();
      if (s.equals("var2")) itt.remove(); // OK
    }

    list.removeIf(s -> s.equals("var2")); // Same as above (replaced by lambda)

    System.out.println(list);
  }
}
