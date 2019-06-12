package effective.generics.n29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class GetAnnotation {

  static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
    Class<?> annotationType = null; // 非境界型トークン
    try {
      annotationType = Class.forName(annotationTypeName);
    } catch (Exception ex) {
      throw new IllegalArgumentException(ex);
    }
    return element.getAnnotation(annotationType.asSubclass(Annotation.class));
  }
}
