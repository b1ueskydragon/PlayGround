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

  public static void main(String[] args) {

    final DragonBuilder builder = new DragonBuilderImpl();
    final DragonBuildDirector director = new DragonBuildDirector(builder);

    System.out.println(director.construct(11101, "skyblue"));

  }

}
