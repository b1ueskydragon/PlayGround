package quiz;

public class FlowControlChallenge2 {
  public static void main(String... args) {
    boolean isBarneyAlcoholic = true;
    boolean isHomerFat = true;
    String result = "";

    if (isHomerFat = false | (isBarneyAlcoholic = false)) {
      result += 1;
    }
    if (isHomerFat || isBarneyAlcoholic) {
      result += 2;
    }
    if (!isHomerFat && !isBarneyAlcoholic) {
      result += 3;
    }
    if ((isHomerFat = true) & (isBarneyAlcoholic = true)) {
      result += 4;
    }
    if (isHomerFat || (isBarneyAlcoholic = false)) {
      result += 5;
    }

    System.out.println(result + isHomerFat + isBarneyAlcoholic);
  }

}

