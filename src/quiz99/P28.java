package quiz99;

import java.util.ArrayList;
import java.util.List;

public class P28 {
  public static void main(String... args) {
    List<List<String>> given = new ArrayList<>() {{
      add(new ArrayList<>() {{
            add("a");
            add("b");
            add("c");
          }}
      );
      add(new ArrayList<>() {{
            add("d");
            add("e");
          }}
      );
      add(new ArrayList<>() {{
            add("f");
            add("g");
            add("h");
          }}
      );
      add(new ArrayList<>() {{
            add("d");
            add("e");
          }}
      );
      add(new ArrayList<>() {{
            add("i");
            add("j");
            add("j");
            add("k");
            add("l");
          }}
      );
      add(new ArrayList<>() {{
            add("m");
            add("n");
          }}
      );
      add(new ArrayList<>() {{
            add("o");
          }}
      );
    }};
  }
}
