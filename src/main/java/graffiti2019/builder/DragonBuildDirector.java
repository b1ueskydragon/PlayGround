package graffiti2019.builder;

/** App has Main execution */
public class DragonBuildDirector {

  private DragonBuilder builder;

  public DragonBuildDirector(final DragonBuilder builder) {
    this.builder = builder;
  }

  public Dragon construct(Integer age, String color) {
    return builder.setAge(age).setColor(color).build();
  }

}
