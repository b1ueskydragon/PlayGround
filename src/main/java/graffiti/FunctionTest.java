package graffiti;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionTest {
  public static void main(String[]args){

    Testter test = new Testter();

    List<String> result =
    test.getRatingList()
        .stream().map(f -> f.toString())
        .collect(Collectors.toList());

    // あえていろいろ
    List<String> bowl = new ArrayList<>();
    result.forEach(s -> bowl.add(s));
    bowl.forEach(System.out::println);

  }
}

class Testter {
  private List<Float> ratingList = new ArrayList<>();

  Testter(){
    float i = 0;
    while(i <= 5) {
      this.ratingList.add(i);
      i += 0.5;
    }
  }

  public List<Float> getRatingList() {
    return ratingList;
  }
}
