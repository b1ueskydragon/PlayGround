package graffiti;

public class TwoDimensionalArray {

  public static void main(String [] args) {

     String [][] tdary = new String[4][5];

    for(int i = 0 ; i < 4 ; i ++) {
      for(int j = 0 ; j < 5; j ++ ) {
        tdary[i][j] = "*";
      }
    }

    System.out.println(tdary[3][4]); // *
   // System.out.println(tdary[4][3]); //  エラー

    System.out.println(tdary.length); // 4
    System.out.println(tdary[0].length); // 5

//   for(int i = 0; i < 4 ; i ++) {
//     System.out.print(tdary[i][0]);
//    }
//    System.out.println(System.getProperty("line.separator"));
//    for(int i = 0; i < 4 ; i ++) {
//      System.out.print(tdary[0][i]);
//    }
  }
}
