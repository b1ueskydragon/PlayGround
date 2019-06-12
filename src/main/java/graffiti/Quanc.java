package graffiti;

/**
 * 꿩
 */
public class Quanc {

  private final static char mars = '\u25A3';
  private final static char white = '\u25A1';
  private final static char[][] background = new char[15][15];

  public static void main(String[] args) {

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 15; j++) {
        if (j % 2 == 0) background[i][j] = white;
        else background[i][j] = mars;
      }
    }

    for (int i = 0; i < 15; i++) {
        System.out.println(background[i]);
    }
  }
}
