package graffiti2019;

import java.util.function.Consumer;

public class PetitConsumer {

  private <T> void f(T arg) {
    System.out.println("Do some funny thing with " + arg);
  }

  public <T> Consumer<T> doNaiveConsume() {
    Consumer<T> consumer = new Consumer<T>() {
      @Override
      public void accept(T t) {
        f(t);
      }
    };
    return consumer;
  }

  public <T> Consumer<T> doConsume() {
    Consumer<T> consumer = x -> f(x); // this::f
    return consumer;
  }

  public static void main(String[] args) {
    var underTest = new PetitConsumer();
    // invoke by accept
    underTest.doNaiveConsume().accept("Shisa");
    underTest.doConsume().accept("Shisa");
  }

}
