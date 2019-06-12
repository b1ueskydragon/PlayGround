package quiz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionChallenge4 {

  public static void main(String... args) throws Exception {
    Constructor<Knight> constructor = Knight.class.getConstructor(String.class);

    Knight knight = constructor.newInstance("katana");

    // a. void slash()
    Method method = knight.getClass().getDeclaredMethod("slash");
    method.invoke(knight);

    // b. void slash(params)
    Method methodParam = knight.getClass().getDeclaredMethod("slash", String.class);
    methodParam.invoke(knight, "slash");
  }

  static class Knight {
    private String sword;

    // constructor
    public Knight(String sword) {
      this.sword = sword;
    }

    // method a
    void slash() {
      System.out.println(sword + ":slash");
    }

    // method b
    void slash(String slashType) {
      System.out.println(sword + ":" + slashType);
    }
  }
}
