package graffiti2019.builder;

public class DragonBuilderImpl implements DragonBuilder {

  private Dragon dragon;

  public DragonBuilderImpl() {
    this.dragon = new Dragon();
  }

  @Override
  public Dragon build() {
    if (dragon.getAge() == null || dragon.getColor() == null)
      throw new NullPointerException();

    Dragon dragon = new Dragon();
    dragon.setColor(this.dragon.getColor());
    dragon.setAge(this.dragon.getAge());
    return dragon;
  }

  @Override
  public DragonBuilder setAge(final Integer age) {
    dragon.setAge(age);
    return this;
  }

  @Override
  public DragonBuilder setColor(final String color) {
    dragon.setColor(color);
    return this;
  }
}
