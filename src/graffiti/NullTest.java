package graffiti;

public class NullTest {
  public static void main(String[]args){
    Sample sample = new Sample();
    sample.setValue(null);

    System.out.println(sample.getValue());
  }
}

class Sample{
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
