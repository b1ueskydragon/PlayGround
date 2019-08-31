package graffiti2019.builder;

/** Abstraction */
public interface DragonBuilder {

  Dragon build();

  DragonBuilder setAge(final int age);

  DragonBuilder setColor(final String color);

}
