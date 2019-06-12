package graffiti2019.adapter;

import static java.lang.System.out;

public class Sparrow implements Bird {
  @Override
  public void fly() {
    out.println("Flying");
  }

  @Override
  public void makeSound() {
    out.println("Chirp Chirp");
  }
}
