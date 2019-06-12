package graffiti2019.adapter;

public class App {

  public static void main(String[] args) {

    Sparrow sparrow = new Sparrow();
    ToyDuck toyDuck = new PlasticToyDuck();

    // Wrap a bird in a birdAdapter so that it behaves like toy duck
    ToyDuck birdAdapter = new BirdAdapter(sparrow);

    sparrow.fly();
    sparrow.makeSound();

    toyDuck.squeak();

    // toy duck behaving like a bird
    birdAdapter.squeak();

  }

}
