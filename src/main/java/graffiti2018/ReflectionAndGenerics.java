package graffiti2018;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class ReflectionAndGenerics {

  public static void main(String... args) throws NoSuchMethodException {

    Method m1 = ReflectionAndGenerics.class.getMethod("M01", List.class);
    Type[] types1 = m1.getGenericParameterTypes();
    for (Type type : types1) {
      System.out.println(type);
    }

    Method m2 = ReflectionAndGenerics.class.getMethod("M02", List.class);
    Type[] types2 = m2.getGenericParameterTypes();
    for (Type type : types2) {
      System.out.println(type);
    }

    Method m3 = ReflectionAndGenerics.class.getMethod("M03", List.class);
    Type[] types3 = m3.getGenericParameterTypes();
    for (Type type : types3) {
      System.out.println(type);
    }

    //Arrays.stream(ReflectionAndGenerics.class.getMethods()).forEach(System.out::println);

    List lst = new ArrayList();
    lst.add("inagon");
    lst.add(11111);

    Iterator it = lst.iterator();
    while (it.hasNext()) {
      Object o = it.next();
      System.out.print((String) o);
    }
  }

  public void M01(List<String> list) {
  }

  public void M02(List list) {
  }

  public void M03(List<?> list) {
  }
}