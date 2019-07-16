package fe.afternoon.h29a;

import java.util.Comparator;

@Deprecated
public class TableSorterTester {
  public static void main(String... args) {
    /*
     *  col
     *   |
     * "apple", "3", "1,000" --- row
     */
    String[][] data = new String[][]{
        {"apple", "3", "1,000"},
        {"cherry", "1", "1,000"},
        {"banana", "1", "300"},
        {"banana", "2", "2,000"},
        {"apple", "2", "300"},
    };

    TableSorter sorter = new TableSorter();

    sorter.putSortOrder("lex", new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });

    sorter.putSortOrder("num", new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return new Integer(o1).compareTo(new Integer(o2));
      }
    });

    /* a */
    sorter.sort(data, new TableSorter.OrderBy("lex", 0),
        new TableSorter.OrderBy("num", 1, true));

//    /* b */
//    sorter.sort(data, new TableSorter.OrderBy("lex", 2),
//        new TableSorter.OrderBy("lex",0));
//
//    /* c */
//    sorter.putSortOrder("numC", new Comparator<String>() {
//      @Override
//      public int compare(String s1, String s2) {
//        return new Integer(s1.replace(",", ""))
//            .compareTo(new Integer(s2.replace(",", "")));
//      }
//    });
//    sorter.sort(data, new TableSorter.OrderBy("numC", 2),
//        new TableSorter.OrderBy("lex", 0));

    for (String[] row : data) {
      for (String col : row) {
        System.out.printf("%s ", col);
      }
      System.out.println();
    }
  }
}
