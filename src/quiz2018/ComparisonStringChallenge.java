package quiz2018;

public class ComparisonStringChallenge {
  public static void main(String... args) {
    String result = "";
    result += " powerfulCode ".trim() == "powerfulCode" ? "1" : "2";
    result += "flexibleCode" == "flexibleCode" ? "3" : "4";
    result += new String("doYourBest") == new String("doYourBest") ? "5" : "6";
    result += new String("noBugsProject").equals("noBugsProject") ? "7" : "8";
    System.out.println(result);
  }
}
