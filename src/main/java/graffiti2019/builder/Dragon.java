package graffiti2019.builder;

/** Model */
public class Dragon {

  private int age;
  private String color;

  public Dragon() { /* empty-param public constructor */ }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  public void setAge(final int age) {
    this.age = age;
  }

  public void setColor(final String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Age is: " + age + ", Color is: " + color;
  }

}
