package graffiti2019.builder_link_all;

public class Dragon {

  private final String color; // required

  private final String name; // required

  private final Integer age; // optional

  /** Field required */
  public static interface ColorBuilder {
    Builder color(String color);
  }

  /** Field required */
  public static interface NameBuilder {
    Builder name(String name);
  }

  /** public instance */
  public static Builder builder() {
    return new Builder();
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

  /**
   * Getters Below
   */
  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  /** Inner static (public) class */
  public static class Builder implements ColorBuilder, NameBuilder {
    private String color;
    private String name;
    private Integer age;

    private Builder() { /* only for to private */ }

    public Builder color(String color) {
      this.color = color;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

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

}
