package quiz;

import java.lang.reflect.Field;

public class ReflectionChallenge5 {

  public static void main(String[] args) throws Exception {
    // class Knight should be static to be referenced from a static context
    Knight knight = new Knight();

    for (Field field : Knight.class.getDeclaredFields()) {
      System.out.println(field.get(knight));
    }

    for(Field field : Integer.class.getDeclaredFields()) {
      System.out.println(field);
    }

//    Arrays.stream(Knight.class.getDeclaredFields())
//        .forEach(field -> {
//          try {
//            System.out.println(field.get(knight));
//          } catch (IllegalAccessException e) {
//            e.printStackTrace();
//          }
//        });
  }

  static class Knight {
    public String sword = "masamune";
    int level = 99;
    private String armor = "dragonScale";
  }
}
