package graffiti2019.builder;

public class DragonBuilderImpl implements DragonBuilder {

  private Dragon tmpDragon;

  public DragonBuilderImpl() {
    tmpDragon = new Dragon();
  }

  @Override
  public Dragon build() {
    Dragon dragon = new Dragon();
    dragon.setColor(tmpDragon.getColor());
    dragon.setAge(tmpDragon.getAge());
    return dragon;
  }

  @Override
  public DragonBuilder setAge(final int age) {
    tmpDragon.setAge(age);
    return this;
  }

  @Override
  public DragonBuilder setColor(final String color) {
    tmpDragon.setColor(color);
    return this;
  }
}
