package graffiti2019.adapter;

public class BirdAdapter implements ToyDuck {

  private final Bird bird;

  public BirdAdapter(Bird bird) {
    this.bird = bird;
  }

  @Override
  public void squeak() {
    bird.makeSound(); // translate the methods appropriately
  }
}
