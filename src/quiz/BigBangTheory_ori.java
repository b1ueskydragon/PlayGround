package quiz;

public class BigBangTheory_ori {

  public static void main(String... makeYourCodePowerful) { // String .. makeYourCodePowerful
    Scientist scientist = new Sheldon() {
      public void search() {
        System.out.println("This is my new spot!");
      }
    };
    scientist.search();
  }

  interface Scientist {
    void search();
  }

  public static class Sheldon implements Scientist { // BigBangTheory型??
    public void search() {
      System.out.println("This is my spot.");
    }

  }
}
