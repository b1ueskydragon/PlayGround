package graffiti2019;

class OneToHundred {

  private int num;

  public static int count;

  OneToHundred() {
    count++;
    num = count;
    System.out.println(num); // print count is ok
  }

  public static void main(String[] args) {
    // initialized outside of the scope.
    count = 0;

    // OneToHundred[] obj = new OneToHundred[100];
    new OneToHundred();
    new OneToHundred();
    new OneToHundred();
    new OneToHundred();
  }

}
