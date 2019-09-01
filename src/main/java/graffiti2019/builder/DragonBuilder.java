package graffiti2019.builder;

/** Abstraction */
public interface DragonBuilder {

  Dragon build();

  DragonBuilder setAge(final Integer age);

  DragonBuilder setColor(final String color);

}
