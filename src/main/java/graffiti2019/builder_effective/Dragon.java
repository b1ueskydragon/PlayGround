package graffiti2019.builder_effective;

public class Dragon {

  private final String color; // required

  private final String name; // required

  private final Integer age; // optional

  /** Inner static (public) class */
  public static class Builder {
    private String color;
    private String name;
    private Integer age;

    /** Fields required */
    public Builder(String color, String name) {
      this.color = color;
      this.name = name;
    }

    /** Field optional */
    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    /** Check Constraint in build method */
    public Dragon build() {
      if (color == null || name == null)
        throw new NullPointerException("field Color and Name are required.");
      return new Dragon(this);
    }

  }

  /**
   * Initialize Constructor
   *
   * @param builder Builder instance
   */
  private Dragon(Builder builder) {
    color = builder.color;
    name = builder.name;
    age = builder.age;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

}
