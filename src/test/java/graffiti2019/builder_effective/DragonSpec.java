package graffiti2019.builder_effective;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DragonSpec {

  @Test
  void test_builder() {
    var dragon = new Dragon
        .Builder("white blue", "u-gon")
        .age(1100)
        .build();

    assertEquals("white blue", dragon.getColor());
    assertEquals("u-gon", dragon.getName());
    assertEquals(1100, dragon.getAge());
  }

}
